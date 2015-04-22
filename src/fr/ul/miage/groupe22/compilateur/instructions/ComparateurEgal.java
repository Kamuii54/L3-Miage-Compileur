package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class ComparateurEgal extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		
		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		resultat += this.getFilsDroit().genererCode(tds, currentScope);

		resultat += "POP(R1) \n";
		resultat += "POP(R0) \n";

		resultat += "CMPEQ(R0, R1, R2)";

		resultat += "PUSH(R2)";

		return resultat;
	}

}
