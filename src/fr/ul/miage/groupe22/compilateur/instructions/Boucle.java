package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Boucle extends Noeud {

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
	
	@Override
	public String toString() {
		return " -Boucle : "+ super.toString()+ " }- ";
	}
}
