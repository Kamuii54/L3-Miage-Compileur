package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.ArrayList;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;


public abstract class Noeud {

	private static int next_id = 0;

	private int id = 0;
	
	private ArrayList<Noeud> listeFils = new ArrayList<Noeud>();
	
	private String idf;
	
	public Noeud(){
		this.id = next_id;
		next_id++;
	}
	

	public Noeud(String idf) {
		this.idf = idf;
	}


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}
	
	public String getIdf(){
		return this.idf;
	}
	
	public abstract String genererCode(TableDesSymboles tds, Scope currentScope);
	
	public void InsererUnFils(Noeud fils)
	{
		this.listeFils.add(fils);
	}
	
	public void InsererListeFils(ArrayList<Noeud> listeFilsAjout)
	{
		this.listeFils.addAll(listeFilsAjout);
	}
	
	public void InsererFilsGauche(Noeud filsGauche)
	{
		this.listeFils.add(0, filsGauche);
	}
	
	public void InsererFilsDroit(Noeud filsDroit)
	{
		this.listeFils.add(1, filsDroit);
	}
	
	
	public ArrayList<Noeud> getListeFils(){
		return this.listeFils;
	}
	
	public Noeud getFilsGauche() {
		return this.listeFils.get(0);
	}

	public Noeud getFilsDroit() {
		return this.listeFils.get(1);
	}
	
	public Noeud getNoeud(int i){
		return this.listeFils.get(i);
	}
	
	public void setListeFils(ArrayList<Noeud> listeFils) {
		this.listeFils = listeFils;
	}
}
