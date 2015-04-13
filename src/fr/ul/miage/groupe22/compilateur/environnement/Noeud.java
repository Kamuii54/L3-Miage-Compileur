package fr.ul.miage.groupe22.compilateur.environnement;

import java.util.ArrayList;

public class Noeud <T> {
	private String typeNoeud;
	private T valeurNoeud;
	private ArrayList<Noeud> listeFils = new ArrayList<Noeud>();
	private Definition reference;
	
	public Noeud() 
	{
		this.listeFils = new ArrayList<Noeud>();
	}
	
	public Noeud(String type, T valeur)
	{
		this.typeNoeud = type;
		this.valeurNoeud = valeur;
	}
	
	public Noeud(String type, T valeur, Definition reference)
	{
		this.typeNoeud = type;
		this.valeurNoeud = valeur;
		this.reference = reference;
	}
	
	public Noeud(String type)
	{
		this.typeNoeud = type;
	}
	
	public Noeud(String type, Definition reference)
	{
		this.typeNoeud = type;
		this.reference = reference;
	}
	
	public void InsererUnFils(Noeud fils)
	{
		this.listeFils.add(fils);
	}
	
	public void InsererListeFils(ArrayList<Noeud> listeFilsAjout)
	{
		this.listeFils.addAll(listeFilsAjout);
	}
	
	public void InsererFilsDroit(Noeud filsDroit)
	{
		this.listeFils.add(1, filsDroit);
	}
	
	public void InsererFilsGauche(Noeud filsGauche)
	{
		this.listeFils.add(0, filsGauche);
	}

	public String getTypeNoeud() {
		return typeNoeud;
	}

	public T getValeurNoeud() {
		return valeurNoeud;
	}

	public ArrayList<Noeud> getListeFils() {
		return listeFils;
	}

	public Definition getReference() {
		return reference;
	}

	public void setTypeNoeud(String typeNoeud) {
		this.typeNoeud = typeNoeud;
	}

	public void setValeurNoeud(T valeurNoeud) {
		this.valeurNoeud = valeurNoeud;
	}

	public void setListeFils(ArrayList<Noeud> listeFils) {
		this.listeFils = listeFils;
	}

	public void setReference(Definition reference) {
		this.reference = reference;
	}

	
	@Override
	public String toString() {
		return "Noeud [typeNoeud=" + typeNoeud + ", valeurNoeud=" + valeurNoeud
				+ ", listeFils=" + listeFils + ", reference=" + reference + "]";
	}
	
	

}
