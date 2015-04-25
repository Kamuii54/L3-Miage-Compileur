package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import fr.ul.miage.groupe22.compilateur.environnement.ScopeGlobal;

public class TableDesSymboles {

	@Override
	public String toString() {
		return "TableDesSymboles [global=" + global + ", table=" + table + "]";
	}
	
	private Scope global = ScopeGlobal.getInstance();
	
	private HashMap<Definition, Symbole> table = new HashMap<>();
	
	private Stack<Symbole> callStack = new Stack<>();

	public boolean hasSymbole(String identifiant, Scope scope){
		Definition def = new Definition(identifiant, scope);
		return this.hasSymbole(def);
	}
	
	public boolean hasSymbole(Definition def){
		return table.containsKey(def);
	}
	
	public Symbole getSymbole(String identifiant, Scope scope){
		Definition def = new Definition(identifiant, scope);
		return this.getSymbole(def);
	}

	public Symbole getSymbole(Definition def) {
		Symbole sym = this.table.get(def);
		if(sym == null){
			Definition defGlobal = new Definition(def.getIdentifiant() , global);
			sym = this.table.get(defGlobal);
		}
		return sym;
	}
	
	public void insert(String identifiant, Scope scope, Symbole symbole){
		Definition def = new Definition(identifiant, scope);
		this.table.put(def, symbole);
	}

	public Map<Definition, Symbole> getTable() {
		return this.table;
	}
	
	public void pushCallStack(Symbole sym){
		this.callStack.push(sym);
	}
	
	public Symbole popCallStack(){
		return this.callStack.pop();
	}

	public void remove(Definition d) {
		this.table.remove(d);
	}

	public Symbole peekCallStack() {
		return this.callStack.peek();
	}
}