package fr.ul.miage.groupe22.compilateur.environnement;

/**
 * Classe Type
 * Correspond aux différent types que peut prendre une variable
 * @author Groupe 22
 *
 */
public enum Type {
	VOID (0),
	INT  (1),
	BOOL (2);
	
	/**
	 * Attribut value : int : valeur correspondant au type
	 */
	private int value;
	
	/**
	 * Constructeur
	 * @param value : valeur a attribuer
	 */
	Type(int value){
		this.value = value;
	}
	
}
