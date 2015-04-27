package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;
import java.util.Map;

/**
 * Correspond a un symbole (variable/fonction) du programme avec sa portee
 * @author Groupe 22
 */
public class Symbole {

	/**
	 * identifiant du symbole
	 */
	private int idf;
	
	/**
	 * identifiant du prochain symbole
	 */
	private static int next_idf=1;

	/**
	 * nom de la variable/fonction
	 */
	private String name;
	
	/**
	 * Type dy smybole
	 */
	private Type type = Type.INT;
	
	/**
	 * portee de la variable/fonction
	 */
	private Scope scope;
	
	/**
	 * Permet de stocker diff�rentes valeurs (nb param, variable, type, valeur)
	 */
	public Map<String, String> values = new HashMap<>();
	
	/**
	 * Constructeur
	 */
	public Symbole() {}
	
	/**
	 * Constructeur
	 * @param name nom du symbole
	 * @param scope portee du symbole
	 * @param values valeurs du symbole
	 */
	public Symbole(String name, Scope scope, Map<String, String> values) {
		this.idf=next_idf++;
		this.name = name;
		this.scope = scope;
		this.values = values;
	}

	/**
	 * Constructeur
	 * @param name nom du symbole
	 * @param type type du symbole
	 * @param scope portee du symbole
	 * @param values valeurs du symbole
	 */
	public Symbole(String name, Type type, Scope scope, Map<String, String> values) {
		this.idf=next_idf++;
		this.name = name;
		this.type = type;
		this.scope = scope;
		this.values = values;
	}

	/**
	 * Constructeur
	 * @param name nom du symbole
	 * @param scope portee du symbole
	 */
	public Symbole(String name, Scope scope) {
		this.idf=next_idf++;
		this.name = name;
		this.scope = scope;
	}

	/**
	 * Constructeur
	 * @param name nom du symbole
	 * @param type type du symbole
	 * @param scope portee du symbole
	 */
	public Symbole(String name, Type type, Scope scope) {
		this.idf=next_idf++;
		this.name = name;
		this.type = type;
		this.scope = scope;
	}
	
	/**
	 * Constructeur
	 * @param name nom du symbole
	 * @param type type du symbole
	 * @param scope portee du symbole
	 * @param typage type de donn�e
	 */
	public Symbole(String name, Type type, Scope scope,String typage) {
		this.idf=next_idf++;
		this.name = name;
		this.type = type;
		this.scope = scope;
		this.add("type", typage);
	}
	

	/**
	 * 
	 * @return hashcode du symbole
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());;
		return result;
	}


	/**
	 * Compare deux symboles
	 * @return boolean
	 */
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

	/**
	 * 
	 * @return identifiant du symbole
	 */
	public int getIdf() {
		return idf;
	}

	/**
	 * 
	 * @param idf identifiant du symbole
	 */
	public void setIdf(int idf) {
		this.idf = idf;
	}

	/**
	 * 
	 * @return nom de la variable/fonction
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name nom de la variable/fonction
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return typage du symbole
	 */
	public Type getType() {
		return type;
	}

	/**
	 * 
	 * @param type typage du symbole
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * 
	 * @return portee du symbole
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * 
	 * @param scope portee du symbole
	 */
	public void setScope(Scope scope) {
		this.scope = scope;
	}

	/**
	 * 
	 * @return ensemble des valeurs du symbole
	 */
	public Map<String, String> getValues() {
		return values;
	}

	/**
	 * 
	 * @param values ensemble des valeurs du symbole
	 */
	public void setValues(Map<String, String> values) {
		this.values = values;
	}
	
	/**
	 * 
	 * @param key clé de la donnee
	 * @param value valeur de la donee
	 */
	public void add(String key, String value) {
		this.values.put(key,value);
	}

	/**
	 * Affichage du symbole
	 */
	@Override
	public String toString() {
		return "Symbole [idf=" + idf + ", name=" + name + ", type=" + type
				+ ", scope=" + scope + ", values=" + values + "]";
	}

	/**
	 * 
	 * @param key cle de la donnee
	 * @return valeur de la donnee correspondante
	 */
	public String get(String key) {
		return this.values.get(key);
	}

	/**
	 * supprime valeur de la donnee correspondante
	 * @param key cle de la donnee
	 */
	public void remove(String key) {
		this.values.remove(key);
	}

}
