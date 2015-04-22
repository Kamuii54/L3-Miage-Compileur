package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Variable extends Noeud {

	public Variable(String idf){
		super(idf);
	}
	
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		return "LD(" + this.getIdf() + ", r0)\n" + "PUSH(r0)\n";
	}

}
