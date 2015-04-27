package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 * Classe Condition : Correspond à un noeud de type Condition dans l'arbre
 */
public class Condition extends Noeud {

	/**
	 * Methode genererCode : genere le code assembleur correspondant au noeud
	 * @param tds : tables des symboles contenant variables/fonctions
	 * @param currentScope : correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		//Expression booleenne
		resultat += this.getNoeud(0).genererCode(tds, currentScope);
		
		resultat += "\tPOP(R0) \n";
		resultat += "\tBF(R0, CONDITION_ELSE_" + this.getId() + ")\n";
		
		//instructions clause if
		resultat += this.getNoeud(1).genererCode(tds, currentScope);
		
		resultat += "\tBR(CONDITION_FIN_" + this.getId() + ") \n";
		resultat += "CONDITION_ELSE_" + this.getId() + ": \n";
		
		//instructions clause else
		if (this.getListeFils().size() == 3) {
			resultat += this.getNoeud(2).genererCode(tds, currentScope);
		}
		resultat += "CONDITION_FIN_" + this.getId() + ": \n";
		return resultat;
	}
	
	/**
	 * Methode toString : Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Condition : "+ super.toString()+ " }- ";
	}

}
