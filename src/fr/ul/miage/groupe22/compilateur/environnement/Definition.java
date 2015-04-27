package fr.ul.miage.groupe22.compilateur.environnement;


/**
 * Classe Definition
 * Correspond a la definition d'une variable/fonction, son nom associ� a sa portee
 * 
 */
public class Definition {

	/**
	 * 
	 * Affiche la definition du noeud
	 */
	@Override
	public String toString() {
		return "Definition [idf=" + idf + "]";
	}

	/**
	 * scope : Scope : portee de la variable/fonction
	 */
	private Scope scope;

	/**
	 * idf : String : identifiant de la variable/fonction
	 */
	private String idf;

	/**
	 * Cosntruction Definition 
	 * @param idf identifiant de la variable/fonction
	 * @param scope portee de la variable/fonction
	 */
	public Definition(String idf, Scope scope) {
		this.idf = idf;
		this.scope = scope;
	}
	
	/**
	 * 
	 * @return hashcode correspondant a la definition
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idf == null) ? 0 : idf.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());
		return result;
	}

	/**
	 * Compare deux definition
	 * @return Vrai si les définitions son égaux
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Definition other = (Definition) obj;
		if (idf == null) {
			if (other.idf != null)
				return false;
		} else if (!idf.equals(other.idf))
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
	 * @return nom de la variable/fonction
	 */
	public String getIdentifiant() {
		return this.idf;
	}

	/**
	 * 
	 * @return portee de la variable/fonction
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * 
	 * @param scope portee de la variable/fonction
	 */
	public void setScope(Scope scope) {
		this.scope = scope;
	}

	/**
	 * 
	 * @param idf nom de la variable/fonction
	 */
	public void setIdf(String idf) {
		this.idf = idf;
	}
}
