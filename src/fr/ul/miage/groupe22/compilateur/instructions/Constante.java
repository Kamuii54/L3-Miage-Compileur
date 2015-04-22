package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Constante extends Noeud {
	
	private int valeur;

	public Constante(int valeur){
		this.valeur = valeur;
	}

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		return 	"CMOVE(" + this.valeur + ", r0)\n" + "PUSH(r0)\n";
	}

}
