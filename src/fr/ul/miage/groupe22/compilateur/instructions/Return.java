package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 *  Correspond � un noeud de type Return dans l'arbre
 */
public class Return extends Noeud {

	/**
	 * genere le code assembleur correspondant au noeud
	 * @param tds tables des symboles contenant variables/fonctions
	 * @param currentScope correpond � l'emplacement de g�n�ration du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		//generation de la valeur a retourner
		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		Symbole call = tds.peekCallStack();
		resultat += "\tPOP(r0) \n"
				+ "\tPUTFRAME(r0, (3 + "
				+ call.get("nbParam") + ")*(-4)) \n" 
				+ "\tBR(ret_"	+ call.getName() + ") \n";
		return resultat;
	}
	
	/**
	 * Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Return : "+ super.toString()+ " }- ";
	}

}
