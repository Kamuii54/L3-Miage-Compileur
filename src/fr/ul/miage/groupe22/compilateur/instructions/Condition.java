package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Condition extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		//Expression booléenne
		resultat += this.getNoeud(0).genererCode(tds, currentScope);
		
		resultat += "POP(R0) \n";
		resultat += "BF(R0, CONDITION_ELSE_" + this.getId() + ")";
		
		//instructions
		resultat += this.getNoeud(1).genererCode(tds, currentScope);
		
		resultat += "BR(CONDITION_FIN_" + this.getId() + ")";
		resultat += "CONDITION_ELSE_" + this.getId() + ":";
		
		//instructions else
		if (this.getListeFils().size() == 3) {
			resultat += this.getNoeud(2).genererCode(tds, currentScope);
		}
		resultat += "CONDITION_FIN_" + this.getId() + ":";
		return resultat;
	}

}
