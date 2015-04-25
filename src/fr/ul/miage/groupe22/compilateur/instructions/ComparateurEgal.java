package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class ComparateurEgal extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		
		resultat += this.getFilsGauche().genererCode(tds, currentScope);
		resultat += this.getFilsDroit().genererCode(tds, currentScope);

		resultat += "\tPOP(R1) \n";
		resultat += "\tPOP(R0) \n";

		resultat += "\tCMPEQ(R0, R1, R2) \n";

		resultat += "\tPUSH(R2) \n";

		return resultat;
	}
	
	@Override
	public String toString() {
		return " -ComparateurEgal : "+ super.toString()+ " }- ";
	}

}
