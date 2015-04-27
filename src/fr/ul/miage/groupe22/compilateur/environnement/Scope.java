package fr.ul.miage.groupe22.compilateur.environnement;

/**
 * Classe Scope 
 * Correspond a la portee (position) d une variable/fonction
 * @author Groupe 22
 *
 */
public class Scope {
	
	/**
	 * Attribut next_id : static int : id du prochain Scope
	 */
	private static int next_id = 1;
	
	/**
	 * Attribut id : int : id du Scope
	 */
	private int id;
	
	/**
	 * Attribut rangVar : int : rang dans l'ordre de declaration des variables
	 */
	private int rangVar = 1;
	
	/**
	 * Attribut rangParam : int : rang dans l'ordre de declaration des parametres
	 */
	private int rangParam = 1;
	
	/**
	 * Constructeur Scope
	 */
	public Scope(){
		this.id = next_id;
		next_id++;
	}
	
	/**
	 * Methode getRangVar
	 * @return int : rang de la variable
	 */
	public int getRangVar(){
		return this.rangVar;
	}
	
	/**
	 * Methode addRangVar
	 * Ajoute un rang a la variable
	 */
	public void addRangVar(){
		this.rangVar++;
	}
	
	/**
	 * Methode getRangParam
	 * @return int : rang du parametre
	 */
	public int getRangParam(){
		return this.rangParam;
	}
	
	/**
	 * Methode addRangParam
	 * Ajoute un rang au parametre
	 */
	public void addRangParam(){
		this.rangParam++;
	}
	
	/**
	 * Methode hashCode
	 * @return int : hashcode correspondant au scope
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/**
	 * Methode equals : compare deux scope
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
		Scope other = (Scope) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
