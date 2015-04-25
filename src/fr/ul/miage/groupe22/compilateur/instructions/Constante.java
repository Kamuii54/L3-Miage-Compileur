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
		return 	"\tCMOVE(" + this.valeur + ", r0)\n" + "\tPUSH(r0)\n";
	}
	
	@Override
	public String toString() {
		return " -Constante : "+ super.toString()+ " }- ";
	}
	
	@Override
	public String info(){
		return ""+this.valeur;
	}

	public int getValue() {
		return this.valeur;
	}
}
