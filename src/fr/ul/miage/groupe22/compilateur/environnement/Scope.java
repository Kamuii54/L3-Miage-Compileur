package fr.ul.miage.groupe22.compilateur.environnement;

public class Scope {

	private static int next_id = 1;
	
	private int id;
	
	public Scope(){
		this.id = next_id;
		next_id++;
	}
	
}
