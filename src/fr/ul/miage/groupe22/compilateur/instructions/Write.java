package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Write extends Noeud{

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat ="";
		
		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		resultat += "\tPOP(r0) \n";
		resultat += "\tWRINT() \n";

		return resultat;
	}
	
	@Override
	public String toString() {
		return " -Write : "+ super.toString()+ " }- ";
	}

}
