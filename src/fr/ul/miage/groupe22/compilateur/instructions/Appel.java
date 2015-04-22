package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.ArrayList;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;
import fr.ul.miage.groupe22.compilateur.environnement.Type;

public class Appel extends Noeud {
	
	public Appel(String idf){
		super(idf);
	}

	public Appel(String idf, ArrayList<Noeud> fils) {
		super(idf);
		this.setListeFils(fils);
	}

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		Symbole sym = tds.getSymbole(getIdf(), currentScope);
		int nbAllocate = Integer.parseInt(sym.get("nbParam"));
		resultat += "ALLOCATE(1)";

		for (int i = 0; i < this.getListeFils().size(); i++) {
			resultat += this.getNoeud(i).genererCode(tds, currentScope);
		}

		tds.pushCallStack(sym);
		resultat += "CALL(" + getIdf() + ")"
				+ "DEALLOCATE(" + nbAllocate + ")";
		tds.popCallStack();
		return resultat;
	}

}
