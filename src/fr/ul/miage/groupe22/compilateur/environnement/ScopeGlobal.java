package fr.ul.miage.groupe22.compilateur.environnement;

/**
 * Classe ScopeGlobal héritant Scope
 * Correspond a la portee global
 * @author Groupe22
 *
 */
public class ScopeGlobal extends Scope{


	//Mise en place d'un Singleton
	
	private static ScopeGlobal scope = new ScopeGlobal();
	
	private ScopeGlobal(){}
	
	/**
	 * Retourne l'intance de scope global
	 * @return l'instance
	 */
	public static ScopeGlobal getInstance() {
		return scope;
	}
}
