package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Condition extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		//Expression booléenne
		resultat += this.getNoeud(0).genererCode(tds, currentScope);
		
		resultat += "\tPOP(R0) \n";
		resultat += "\tBF(R0, CONDITION_ELSE_" + this.getId() + ")\n";
		
		//instructions
		resultat += this.getNoeud(1).genererCode(tds, currentScope);
		
		resultat += "\tBR(CONDITION_FIN_" + this.getId() + ") \n";
		resultat += "CONDITION_ELSE_" + this.getId() + ": \n";
		
		//instructions else
		if (this.getListeFils().size() == 3) {
			resultat += this.getNoeud(2).genererCode(tds, currentScope);
		}
		resultat += "CONDITION_FIN_" + this.getId() + ": \n";
		return resultat;
	}
	
	@Override
	public String toString() {
		return " -Condition : "+ super.toString()+ " }- ";
	}

}
