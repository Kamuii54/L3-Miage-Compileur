package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;

import fr.ul.miage.groupe22.compilateur.environnement.Global;

public class TableDesSymboles {

	private Symbole global = Global.getInstance();
	
	private HashMap<Definition, Symbole> table = new HashMap<>();

	public boolean hasSymbole(String identifiant, Symbole portee){
		Definition def = new Definition(identifiant, portee);
		return this.hasSymbole(def);
	}
	
	public boolean hasSymbole(Definition def){
		return table.containsKey(def);
	}
	
	public Symbole getSymbole(String identifiant, Symbole portee){
		Definition def = new Definition(identifiant, portee);
		return this.getSymbole(def);
	}

	public Symbole getSymbole(Definition def) {
		return this.table.get(def);
	}
	
	public void insert(String identifiant, Symbole portee, Symbole symbole){
		Definition def = new Definition(identifiant, portee);
		this.table.put(def, symbole);
	}
}