package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Return extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		resultat += this.getFilsGauche().genererCode(tds, currentScope);

		Symbole call = tds.peekCallStack();
		resultat += "\tPOP(r0) \n"
				+ "\tPUTFRAME(r0, (3 + "
				+ call.get("nbParam") + ")*(-4)) \n" 
				+ "\tBR(ret_"	+ call.getName() + ") \n";
		return resultat;
	}
	
	@Override
	public String toString() {
		return " -Return : "+ super.toString()+ " }- ";
	}

}
