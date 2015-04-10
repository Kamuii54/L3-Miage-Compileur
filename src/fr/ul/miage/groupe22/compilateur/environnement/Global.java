package fr.ul.miage.groupe22.compilateur.environnement;

public class Global extends Symbole{

	private static Global symbole = new Global();
	
	private Global(){}
	
	public static Global getInstance() {
		return symbole;
	}
}
