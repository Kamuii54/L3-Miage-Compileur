package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 * Classe Multiplication : Correspond à un noeud de type Multiplication dans l'arbre
 */
public class Multiplication extends Noeud {

	/**
	 * Methode genererCode : genere le code assembleur correspondant au noeud
	 * @param tds : tables des symboles contenant variables/fonctions
	 * @param currentScope : correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat ="";
		//generation du code des fils gauche et droit, les resultats sont mis dans la pile
		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		resultat += this.getFilsDroit().genererCode(tds, currentScope);
		//on place les valeurs dans le registre et on effectue la multiplication, mise dans la pile
		resultat += "\tPOP(r2)\n"
				+ "\tPOP(r1)\n"
				+ "\tMUL(r1,r2,r3)\n"
				+ "\tPUSH(r3)\n";
		return resultat;
	}
	
	/**
	 * Methode toString : Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Multiplication : "+ super.toString()+ " }- ";
	}

}
