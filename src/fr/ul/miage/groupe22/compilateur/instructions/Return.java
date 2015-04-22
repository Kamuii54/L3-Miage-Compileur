package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Return extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		resultat += this.getFilsGauche().genererCode(tds, currentScope);

		Symbole call = tds.popCallStack();
		resultat += "POP(r0) \n"
				+ "PUTFRAME(r0, (3 + "
				+ call.get("nbParam") + ")*4) \n" 
				+ "BR(ret_"	+ call.getIdf() + ") \n";
		return resultat;
	}

}
