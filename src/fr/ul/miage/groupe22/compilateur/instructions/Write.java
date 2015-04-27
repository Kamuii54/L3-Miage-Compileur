package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * 
 *  Correspond à un noeud de type Read dans l'arbre
 */
public class Write extends Noeud{

	/**
	 * genere le code assembleur correspondant au noeud
	 * @param tds tables des symboles contenant variables/fonctions
	 * @param currentScope correpond à l'emplacement de génération du code
	 */
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat ="";
		//lecture de la valeur puis affichage
		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		resultat += "\tPOP(r0) \n";
		resultat += "\tWRINT() \n";

		return resultat;
	}
	
	/**
	 * Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Write : "+ super.toString()+ " }- ";
	}

}
