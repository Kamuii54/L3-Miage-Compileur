package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.ArrayList;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Container extends Noeud{

	public Container(){
		
	}
	
	public Container(ArrayList<Noeud> fils) {
		this.setListeFils(fils);
	}

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		for (int i = 0; i < this.getListeFils().size(); i++) {
			resultat += this.getNoeud(i).genererCode(tds, currentScope);
		}
		return resultat;
	}
	
	@Override
	public String toString() {
		return " -Container : "+ super.toString()+ " }- ";
	}

}
