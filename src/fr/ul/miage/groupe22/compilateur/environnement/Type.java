package fr.ul.miage.groupe22.compilateur.environnement;

public enum Type {
	VOID (0),
	INT  (1),
	BOOL (2);
	
	
	private int value;
	
	Type(int value){
		this.value = value;
	}
	
}
