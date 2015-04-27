package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Groupe 22
 * Classe Symbole : Correspond a un symbole (variable/fonction) du programme avec sa portee
 */
public class Symbole {

	/**
	 * Attribut idf : identifiant du symbole
	 */
	private int idf;
	
	/**
	 * Attribut idf : static int : identifiant du prochain symbole
	 */
	private static int next_idf=1;

	/**
	 * Attribut name : String : nom de la variable/fonction
	 */
	private String name;
	
	/**
	 * Attribut type : Type dy smybole
	 */
	private Type type = Type.INT;
	
	/**
	 * Attribut scope : portee de la variable/fonction
	 */
	private Scope scope;
	
	/**
	 * Attribut values : Map<String,String>
	 * Permet de stocker différentes valeurs (nb param, variable, type, valeur)
	 */
	public Map<String, String> values = new HashMap<>();
	
	/**
	 * Constructeur
	 */
	public Symbole() {}
	
	/**
	 * Constructeur
	 * @param name : nom du symbole
	 * @param scope : portee du symbole
	 * @param values : valeurs du symbole
	 */
	public Symbole(String name, Scope scope, Map<String, String> values) {
		this.idf=next_idf++;
		this.name = name;
		this.scope = scope;
		this.values = values;
	}

	/**
	 * Constructeur
	 * @param name : nom du symbole
	 * @param type : type du symbole
	 * @param scope : portee du symbole
	 * @param values : valeurs du symbole
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
	 * @param name : nom du symbole
	 * @param scope : portee du symbole
	 */
	public Symbole(String name, Scope scope) {
		this.idf=next_idf++;
		this.name = name;
		this.scope = scope;
	}

	/**
	 * Constructeur
	 * @param name : nom du symbole
	 * @param type : type du symbole
	 * @param scope : portee du symbole
	 */
	public Symbole(String name, Type type, Scope scope) {
		this.idf=next_idf++;
		this.name = name;
		this.type = type;
		this.scope = scope;
	}
	
	/**
	 * Constructeur
	 * @param name : nom du symbole
	 * @param type : type du symbole
	 * @param scope : portee du symbole
	 * @param typage : type de donnée
	 */
	public Symbole(String name, Type type, Scope scope,String typage) {
		this.idf=next_idf++;
		this.name = name;
		this.type = type;
		this.scope = scope;
		this.add("type", typage);
	}
	

	/**
	 * Methode hashCode
	 * @return int : hashcode du symbole
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
	 * Methode equals : Compare deux symboles
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
	 * Methode getIdf
	 * @return int : identifiant du symbole
	 */
	public int getIdf() {
		return idf;
	}

	/**
	 * Methode setIdf
	 * @param int : identifiant du symbole
	 */
	public void setIdf(int idf) {
		this.idf = idf;
	}

	/**
	 * Methode getName
	 * @return String : nom de la variable/fonction
	 */
	public String getName() {
		return name;
	}

	/**
	 * Methode setName
	 * @param String : nom de la variable/fonction
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Methode getType
	 * @return Type : typage du symbole
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Methode setType
	 * @param Type : typage du symbole
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * Methode getScope
	 * @return Scope : portee du symbole
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * Methode setScope
	 * @param Scope : portee du symbole
	 */
	public void setScope(Scope scope) {
		this.scope = scope;
	}

	/**
	 * Methode getValues
	 * @return Map<String, String> : ensemble des valeurs du symbole
	 */
	public Map<String, String> getValues() {
		return values;
	}

	/**
	 * Methode setValues
	 * @param Map<String, String> : ensemble des valeurs du symbole
	 */
	public void setValues(Map<String, String> values) {
		this.values = values;
	}
	
	/**
	 * Methode add
	 * @param key : clé de la donnee
	 * @param value : valeur de la donee
	 */
	public void add(String key, String value) {
		this.values.put(key,value);
	}

	/**
	 * Methode toString : Affichage du symbole
	 */
	@Override
	public String toString() {
		return "Symbole [idf=" + idf + ", name=" + name + ", type=" + type
				+ ", scope=" + scope + ", values=" + values + "]";
	}

	/**
	 * Methode get
	 * @param key : cle de la donnee
	 * @return valeur de la donnee correspondante
	 */
	public String get(String key) {
		return this.values.get(key);
	}

	/**
	 * Methode remove : supprime valeur de la donnee correspondante
	 * @param key : cle de la donnee
	 */
	public void remove(String key) {
		this.values.remove(key);
	}

}
