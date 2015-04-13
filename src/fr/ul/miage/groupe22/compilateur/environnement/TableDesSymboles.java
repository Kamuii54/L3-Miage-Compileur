package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;
import java.util.Map;

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
		Symbole sym = this.table.get(def);
		if(sym == null){
			Definition defGlobal = new Definition(def.getIdentifiant() , Global.getInstance());
			sym = this.table.get(defGlobal);
		}
		return sym;
	}
	
	public void insert(String identifiant, Symbole portee, Symbole symbole){
		Definition def = new Definition(identifiant, portee);
		this.table.put(def, symbole);
	}

	public Map<Definition, String> getTable() {
		return this.getTable();
	}
}