package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Fonction extends Noeud {
	
	public Fonction(String idf){
		super(idf);
	}
	
	
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		Symbole fonction = tds.getSymbole(this.getIdf(), currentScope);
		int nbVariable = Integer.parseInt(fonction.values.get("nbVariable"));
		resultat += "FUNC-" + this.getIdf() +" : \n"
				+ "PUSH(LP)\n"
				+ "MOVE(SP,BP)\n"
				+ "PUSH(BP)\n"
				+ "ALLOCATE(" + fonction.values.get("nbVariable") + ") \n";

		for (int i = 0; i < this.getListeFils().size(); i++) {
			resultat += this.getNoeud(i).genererCode(tds, currentScope);
		}

		resultat += "ret_" + this.getIdf() + " : \n"
				+ "DEALLOCATE(" + nbVariable + ") \n" + "POP(BP)\n"
				+ "POP(LP)\n" + "RTN()\n";

		return resultat;
	}

}
