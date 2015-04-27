package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 *  Correspond à un noeud de type ComparateurSuperieur dans l'arbre
 */
public class ComparateurSuperieur extends Noeud{

	/**
	 * genere le code assembleur correspondant au noeud
	 * @param tds tables des symboles contenant variables/fonctions
	 * @param currentScope correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		//comparaison des deux fils gauches et droit et placement de l egalite dans la pile
		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		resultat += this.getFilsDroit().genererCode(tds, currentScope);

		resultat += "\tPOP(R1) \n";
		resultat += "\tPOP(R0) \n";

		resultat += "\tCMPLT(R1, R0, R2) \n";

		resultat += "\tPUSH(R2) \n";

		return resultat;
	}
	
	/**
	 * Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -ComparateurSuperieur : "+ super.toString()+ " }- ";
	}

}
