package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.ScopeGlobal;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;
/**
 * 
 *  Correspond à un noeud de type Affectation dans l'arbre
 */
public class Affectation extends Noeud {

	/**
	 * genere le code assembleur correspondant au noeud
	 * @param tds tables des symboles contenant variables/fonctions
	 * @param currentScope correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		resultat += this.getFilsDroit().genererCode(tds, currentScope);
		String idfFG = this.getFilsGauche().getIdf();
		
		Symbole var = tds.getSymbole(idfFG, currentScope);
		
		resultat += "\tPOP(r0)\n" ;
		
		if(var.getScope() == ScopeGlobal.getInstance()){
			resultat += "\tST(R0, " + idfFG + ") \n";
		}else if(var.get("type") == "parametre"){
			resultat += "\tPUTFRAME( R0, (2+"+var.get("rang")+")*(-4),)\n";
		}else{
			resultat += "\tPUTFRAME( R0, (1+"+var.get("rang")+")*(4))\n";
		}
		return resultat;
	}
	
	/**
	 * Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Affectation : "+ super.toString()+ " }- ";
	}
}
