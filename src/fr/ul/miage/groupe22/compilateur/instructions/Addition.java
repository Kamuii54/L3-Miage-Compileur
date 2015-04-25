package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Addition extends Noeud {

	public Addition() {
		super("+");
	}
	
	@Override
	public String toString() {
		return " -Addition : "+ super.toString()+ " }- ";
	}

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		resultat += this.getFilsDroit().genererCode(tds, currentScope);
		resultat += "\tPOP(r2)\n"
				+ "\tPOP(r1)\n"
				+ "\tADD(r1,r2,r3)\n"
				+ "\tPUSH(r3)\n";
		return resultat;
	}
}
