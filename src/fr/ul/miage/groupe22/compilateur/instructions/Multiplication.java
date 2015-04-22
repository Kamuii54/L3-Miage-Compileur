package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Multiplication extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat ="";
		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		resultat += this.getFilsDroit().genererCode(tds, currentScope);
		resultat += "POP(r2)\n"
				+ "POP(r1)\n"
				+ "MUL(r1,r2,r3)\n"
				+ "PUSH(r3)\n";
		return resultat;
	}

}
