package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.HashMap;
import java.util.Map;


public class Symbole {

	private int idf;
	
	private String name;
	
	private Type type = Type.INT;
	
	public Map<String, String> values = new HashMap<>();
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idf;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((values == null) ? 0 : values.hashCode());
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
		if (idf != other.idf)
			return false;
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
		if (type != other.type)
			return false;
		if (values == null) {
			if (other.values != null)
				return false;
		} else if (!values.equals(other.values))
			return false;
		return true;
	}


	private Symbole scope;
}
