package fr.ul.miage.groupe22.compilateur.environnement;

/**
 * Classe Type
 * Correspond aux différent types que peut prendre une variable
 * 
 *
 */
public enum Type {
	VOID (0),
	INT  (1),
	BOOL (2);
	
	/**
	 * valeur correspondant au type
	 */
	private int value;
	
	/**
	 * Constructeur
	 * @param value valeur a attribuer
	 */
	Type(int value){
		this.value = value;
	}
	
}
