package fr.ul.miage.groupe22.compilateur.environnement;



public class Definition {

	@Override
	public String toString() {
		return "Definition [idf=" + idf + "]";
	}

	private Scope scope;

	private String idf;

	public Definition(String idf, Scope scope) {
		this.idf = idf;
		this.scope = scope;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idf == null) ? 0 : idf.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());
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

	public String getIdentifiant() {
		return this.idf;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public String getIdf() {
		return idf;
	}

	public void setIdf(String idf) {
		this.idf = idf;
	}
}
