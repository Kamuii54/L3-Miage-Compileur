package fr.ul.miage.groupe22.compilateur.environnement;

/**
 * Classe Scope 
 * Correspond a la portee (position) d une variable/fonction
 * 
 *
 */
public class Scope {
	
	/**
	 * Id du prochain Scope
	 */
	private static int next_id = 1;
	
	/**
	 * Id du Scope
	 */
	private int id;
	
	/**
	 * Rang dans l'ordre de declaration des variables
	 */
	private int rangVar = 1;
	
	/**
	 * Rang dans l'ordre de declaration des parametres
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
	 * 
	 * @return rang de la variable
	 */
	public int getRangVar(){
		return this.rangVar;
	}
	
	/**
	 * 
	 * Ajoute un rang a la variable
	 */
	public void addRangVar(){
		this.rangVar++;
	}
	
	/**
	 * 
	 * @return rang du parametre
	 */
	public int getRangParam(){
		return this.rangParam;
	}
	
	/**
	 * 
	 * Ajoute un rang au parametre
	 */
	public void addRangParam(){
		this.rangParam++;
	}
	
	/**
	 * 
	 * @return hashcode correspondant au scope
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/**
	 * compare deux scope
	 * @return Vrai si les deux éléments sont égaux
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
