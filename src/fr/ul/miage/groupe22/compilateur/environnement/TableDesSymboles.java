package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;

import fr.ul.miage.groupe22.compilateur.environnement.Global;

public class TableDesSymboles {

	private Symbole global = Global.getInstance();
	
	private HashMap<Definition, Symbole> table = new HashMap<>();
}