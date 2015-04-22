package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Boucle extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		resultat += "START_BOUCLE_" + this.getId() + ": ";
		resultat += this.getFilsGauche().genererCode(tds, currentScope);

		resultat += "POP(R0)";
		resultat += "BT(R0, END_BOUCLE_" + this.getId() + ")";
		resultat += this.getFilsDroit().genererCode(tds, currentScope);
		resultat += "BR(START_BOUCLE_" + this.getId() + ")";
		resultat += "END_BOUCLE_" + this.getId() + ": ";
		return resultat;
	}

}
