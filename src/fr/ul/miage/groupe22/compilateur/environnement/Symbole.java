package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;
import java.util.Map;


public class Symbole {

	private int idf;
	
	private static int next_idf=1;

	private String name;
	
	private Type type = Type.INT;
	
	private Scope scope;
	
	public Map<String, String> values = new HashMap<>();
	
	public Symbole() {}
	
	public Symbole(String name, Scope scope, Map<String, String> values) {
		this.idf=next_idf++;
		this.name = name;
		this.scope = scope;
		this.values = values;
	}


	public Symbole(String name, Type type, Scope scope, Map<String, String> values) {
		this.idf=next_idf++;
		this.name = name;
		this.type = type;
		this.scope = scope;
		this.values = values;
	}


	public Symbole(String name, Scope scope) {
		this.idf=next_idf++;
		this.name = name;
		this.scope = scope;
	}


	public Symbole(String name, Type type, Scope scope) {
		this.idf=next_idf++;
		this.name = name;
		this.type = type;
		this.scope = scope;
	}
	
	public Symbole(String name, Type type, Scope scope,String typage) {
		this.idf=next_idf++;
		this.name = name;
		this.type = type;
		this.scope = scope;
		this.add("type", typage);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symbole other = (Symbole) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (scope == null) {
			if (other.scope != null)
				return false;
		} else if (!scope.equals(other.scope))
			return false;
		return true;
	}


	public int getIdf() {
		return idf;
	}


	public void setIdf(int idf) {
		this.idf = idf;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public Scope getScope() {
		return scope;
	}


	public void setScope(Scope scope) {
		this.scope = scope;
	}


	public Map<String, String> getValues() {
		return values;
	}


	public void setValues(Map<String, String> values) {
		this.values = values;
	}
	
	public void add(String key, String value) {
		this.values.put(key,value);
	}

	@Override
	public String toString() {
		return "Symbole [idf=" + idf + ", name=" + name + ", type=" + type
				+ ", scope=" + scope + ", values=" + values + "]";
	}

	public String get(String key) {
		return this.values.get(key);
	}

	public void remove(String key) {
		this.values.remove(key);
	}

}
