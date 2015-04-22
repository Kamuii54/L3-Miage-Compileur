package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.ScopeGlobal;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Affectation extends Noeud {

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		resultat += this.getFilsDroit().genererCode(tds, currentScope);
		String idfFG = this.getFilsGauche().getIdf();
		
		Symbole var = tds.getSymbole(idfFG, currentScope);
		
		
		if (var.getScope().equals(ScopeGlobal.getInstance())) {
			resultat += "POP(r0)\n" 
					 +	"ST(r0," + idfFG  + ")\n";
		} else {
			int valeur = Integer.parseInt(var.values.get("rang"));
			int nbOctet = (1 + valeur) * 4;
			resultat += "PUTFRAME(r0," + nbOctet + ")\n";
		}
		return resultat;
	}

}
