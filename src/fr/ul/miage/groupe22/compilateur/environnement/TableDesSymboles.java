package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import fr.ul.miage.groupe22.compilateur.environnement.ScopeGlobal;

/**
 * Classe TableDesSymboles
 * Correspond a l'ensemble des variables/fonctions d'un programme
 * @author Groupe22
 *
 */
public class TableDesSymboles {
	
	/**
	 * 
	 * Affiche la table des symboles
	 */
	@Override
	public String toString() {
		return "TableDesSymboles [global=" + global + ", table=" + table + "]";
	}
	
	/**
     * portee global
	 */
	private Scope global = ScopeGlobal.getInstance();
	
	/**
	 * Correspond a la liste des symboles, leur definition associ� a leur portee
	 */
	private HashMap<Definition, Symbole> table = new HashMap<>();
	
	/**
	 * Represente la pile des symboles (necessaire pour l execution)
	 */
	private Stack<Symbole> callStack = new Stack<>();

	/**
	 * 
	 * @param identifiant nom du symbole
	 * @param scope portee du symbole
	 * @return si le symbole est contenu dans la table
	 */
	public boolean hasSymbole(String identifiant, Scope scope){
		Definition def = new Definition(identifiant, scope);
		return this.hasSymbole(def);
	}
	
	/**
	 * 
	 * @param def definition du symbole
	 * @return si le symbole defini est contenu dans la table
	 */
	public boolean hasSymbole(Definition def){
		return table.containsKey(def);
	}
	
	/**
	 * 
	 * @param identifiant nom du symbole
	 * @param scope portee du symbole
	 * @return symbole correspondant
	 */
	public Symbole getSymbole(String identifiant, Scope scope){
		Definition def = new Definition(identifiant, scope);
		return this.getSymbole(def);
	}

	/**
	 * 
	 * @param def definition du symbole
	 * @return symbole correspondant
	 */
	public Symbole getSymbole(Definition def) {
		Symbole sym = this.table.get(def);
		if(sym == null){
			Definition defGlobal = new Definition(def.getIdentifiant() , global);
			sym = this.table.get(defGlobal);
		}
		return sym;
	}
	
	/**
	 * insere un symbole dans la table
	 * @param identifiant nom du symbole
	 * @param scope portee du symbole
	 * @param symbole symbole correspondant
	 */
	public void insert(String identifiant, Scope scope, Symbole symbole){
		Definition def = new Definition(identifiant, scope);
		this.table.put(def, symbole);
	}

	/**
	 * 
	 * @return table des symboles
	 */
	public Map<Definition, Symbole> getTable() {
		return this.table;
	}
	
	/**
	 * 
	 * @param sym symbole a mettre dans la pile
	 */
	public void pushCallStack(Symbole sym){
		this.callStack.push(sym);
	}
	
	/**
	 * 
	 * @return symbole a retirer de la pile
	 */
	public Symbole popCallStack(){
		return this.callStack.pop();
	}

	/**
	 * 
	 * @param d definition du symbole a retirer de la table
	 */
	public void remove(Definition d) {
		this.table.remove(d);
	}
	
	/**
	 * 
	 * @return symbole en haut de la pile
	 */
	public Symbole peekCallStack() {
		return this.callStack.peek();
	}
}