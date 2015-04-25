package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Read extends Noeud{

	public Read(){
		super("read");
	}
	
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat ="\tRDINT() \n\tPUSH(r0) \n";
		return resultat;
	}
	
	@Override
	public String toString() {
		return " -Read : "+ super.toString()+ " }- ";
	}
	
}
