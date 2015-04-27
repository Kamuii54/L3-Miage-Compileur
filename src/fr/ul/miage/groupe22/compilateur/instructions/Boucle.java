package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 * Classe Boucle : Correspond à un noeud de type Boucle dans l'arbre
 */
public class Boucle extends Noeud {

	/**
	 * Methode genererCode : genere le code assembleur correspondant au noeud
	 * @param tds : tables des symboles contenant variables/fonctions
	 * @param currentScope : correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		
		resultat += "START_BOUCLE_" + this.getId() + ":\n";
		resultat += this.getFilsGauche().genererCode(tds, currentScope);

		resultat += "\tPOP(R0)\n";
		resultat += "\tBF(R0, END_BOUCLE_" + this.getId() + ")\n";
		resultat += this.getFilsDroit().genererCode(tds, currentScope);
		resultat += "\tBR(START_BOUCLE_" + this.getId() + ") \n";
		resultat += "END_BOUCLE_" + this.getId() + ":\n";
		return resultat;
	}
	
	/**
	 * Methode toString : Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Boucle : "+ super.toString()+ " }- ";
	}
}
