package fr.ul.miage.groupe22.compilateur.environnement;

public class Scope {
	
	private static int next_id = 1;
	
	private int id;
	
	private int rangVar = 1;
	
	private int rangParam = 1;
	
	public Scope(){
		this.id = next_id;
		next_id++;
	}
	
	public int getRangVar(){
		return this.rangVar;
	}
	
	public void addRangVar(){
		this.rangVar++;
	}
	
	public int getRangParam(){
		return this.rangParam;
	}
	
	public void addRangParam(){
		this.rangParam++;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Scope other = (Scope) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
