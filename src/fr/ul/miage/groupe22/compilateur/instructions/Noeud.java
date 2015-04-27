package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.ArrayList;
import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * Classe abstraite Noeud
 * Correspond a un abstrait de l'arbre
 * 
 */
public abstract class Noeud {

	/**
	 * Affiche le noeud
	 */
	@Override
	public String toString() {
		return ""+listeFils;
	}

	/**
	 * Attribut next_id : static int : id du prochain noeud
	 */
	private static int next_id = 0;

	/**
	 * id du noeud
	 */
	private int id = 0;
	
	/**
	 * Correspond a tous les noeuds fils de ce noeud
	 */
	private ArrayList<Noeud> listeFils = new ArrayList<Noeud>();
	
	/**
	 * Correspond a l'identifiant du noeud (variable par exemple)
	 */
	private String idf;
	
	public Noeud(){
		this.id = next_id;
		next_id++;
	}
	
	/**
	 * Constructeur Noeud
	 * @param idf identifiant
	 */
	public Noeud(String idf) {
		this.idf = idf;
	}


	/**
	 * 
	 * @return id du noeud
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @return identifiant du noeud
	 */
	public String getIdf(){
		return this.idf;
	}
	
	/**
	 * genererCode : genere le code assembleur correspondant au noeud
	 * @param tds tables des symboles contenant variables/fonctions
	 * @param currentScope correpond à la portée actuel de la génération du code
	 * @return Le codé généré
	 */
	public abstract String genererCode(TableDesSymboles tds, Scope currentScope);
	
	/**
	 * 
	 * @param fils Noeud a ajouter
	 */
	public void InsererUnFils(Noeud fils)
	{
		this.listeFils.add(fils);
	}
	
	/**
	 * 
	 * @param listeFilsAjout Liste de noeuds a ajouter
	 */
	public void InsererListeFils(ArrayList<Noeud> listeFilsAjout)
	{
		this.listeFils.addAll(listeFilsAjout);
	}
	
	/**
	 * 
	 * @param filsGauche Noeud a ajouter
	 */
	public void InsererFilsGauche(Noeud filsGauche)
	{
		this.listeFils.add(0, filsGauche);
	}
	
	/**
	 * 
	 * @param filsDroit Noeud a ajouter
	 */
	public void InsererFilsDroit(Noeud filsDroit)
	{
		this.listeFils.add(1, filsDroit);
	}
	
	/**
	 * 
	 * @return liste des noeuds fils
	 */
	public ArrayList<Noeud> getListeFils(){
		return this.listeFils;
	}
	
	/**
	 * 
	 * @return noeud gauche
	 */
	public Noeud getFilsGauche() {
		return this.listeFils.get(0);
	}

	/**
	 * 
	 * @return noeud droit
	 */
	public Noeud getFilsDroit() {
		return this.listeFils.get(1);
	}
	
	/**
	 * 
	 * @param i emplacement du noeud
	 * @return Noeud
	 */
	public Noeud getNoeud(int i){
		return this.listeFils.get(i);
	}
	
	/**
	 * 
	 * @param listeFils liste de noeuds a mettre dans le noeud courant
	 */
	public void setListeFils(ArrayList<Noeud> listeFils) {
		this.listeFils = listeFils;
	}
	
	/**
	 * Affiche l'arborescence de l'arbre et des noeuds
	 * @param rang rang du noeud concern�
	 * @param last L'élèment est le dernier de sa liste
	 * @param barre Parametre pour affichage des barres des liens des parents
	 */
	public void affiche(int rang, boolean last, ArrayList<Boolean> barre){
		String res = "";
		for(int i = 0; i < rang-1; i++){
			res += barre.get(i) ? "│  " : "   ";
		}
		if(rang > 0)
			if(last)
				res += "└ ";
			else 
				res += "├ ";
		System.out.println(res + this.getClass().getSimpleName() + " : " + this.info());
		for(int i = 0; i < listeFils.size() ; i++){
			if(i == listeFils.size()-1){
				barre.add(false);
				listeFils.get(i).affiche(rang+1, true, barre);
				barre.remove(barre.size()-1);
			}else{
				barre.add(true);
				listeFils.get(i).affiche(rang+1, false, barre);
				barre.remove(barre.size()-1);

			}
		}
	}

	/**
	 * 
	 * @return String vide
	 */
	public String info() {
		return "";
	}


}
