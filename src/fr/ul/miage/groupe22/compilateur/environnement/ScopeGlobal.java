package fr.ul.miage.groupe22.compilateur.environnement;

public class ScopeGlobal extends Scope{

	private static ScopeGlobal scope = new ScopeGlobal();
	
	private ScopeGlobal(){}
	
	public static ScopeGlobal getInstance() {
		return scope;
	}
}
