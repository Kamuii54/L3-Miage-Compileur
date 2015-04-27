package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.ArrayList;
import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * Classe abstraite Noeud
 * Correspond a un abstrait de l'arbre
 * @author Groupe 22
 */
public abstract class Noeud {

	/**
	 * Methode toString : Affiche le noeud
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
	 * Attribut id : int : id du noeud
	 */
	private int id = 0;
	
	/**
	 * Attribut listefils : ArrayList<Noeud> : Correspond a tous les noeuds fils de ce noeud
	 */
	private ArrayList<Noeud> listeFils = new ArrayList<Noeud>();
	
	/**
	 * Attribut idf : String : Correspond a l'identifiant du noeud (variable par exemple)
	 */
	private String idf;
	
	public Noeud(){
		this.id = next_id;
		next_id++;
	}
	
	/**
	 * Constructeur Noeud
	 * @param idf : String : identifiant
	 */
	public Noeud(String idf) {
		this.idf = idf;
	}


	/**
	 * Methode getId
	 * @return id : id du noeud
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Methode getIdf
	 * @return idf : String : identifiant du noeud
	 */
	public String getIdf(){
		return this.idf;
	}
	
	/**
	 * Methode abstraite genererCode : genere le code assembleur correspondant au noeud
	 * @param tds : tables des symboles contenant variables/fonctions
	 * @param currentScope : correpond à l'emplacement de génération du code
	 */
	public abstract String genererCode(TableDesSymboles tds, Scope currentScope);
	
	/**
	 * Methode InsererUnFils
	 * @param fils : Noeud a ajouter
	 */
	public void InsererUnFils(Noeud fils)
	{
		this.listeFils.add(fils);
	}
	
	/**
	 * Methode InsererListeFils
	 * @param listeFilsAjout : Liste de noeuds a ajouter
	 */
	public void InsererListeFils(ArrayList<Noeud> listeFilsAjout)
	{
		this.listeFils.addAll(listeFilsAjout);
	}
	
	/**
	 * Methode InsererFilsGauche
	 * @param fils : Noeud a ajouter
	 */
	public void InsererFilsGauche(Noeud filsGauche)
	{
		this.listeFils.add(0, filsGauche);
	}
	
	/**
	 * Methode InsererFilsDroit
	 * @param fils : Noeud a ajouter
	 */
	public void InsererFilsDroit(Noeud filsDroit)
	{
		this.listeFils.add(1, filsDroit);
	}
	
	/**
	 * Methode getListeFils
	 * @return ArrayList<Noeud> : liste des noeuds fils
	 */
	public ArrayList<Noeud> getListeFils(){
		return this.listeFils;
	}
	
	/**
	 * Methode getFilsGauche
	 * @return Noeud : noeud gauche
	 */
	public Noeud getFilsGauche() {
		return this.listeFils.get(0);
	}

	/**
	 * Methode getFilsDroit
	 * @return Noeud : noeud droit
	 */
	public Noeud getFilsDroit() {
		return this.listeFils.get(1);
	}
	
	/**
	 * Methode getNoeud
	 * @param i : int : emplacement du noeud
	 * @return Noeud
	 */
	public Noeud getNoeud(int i){
		return this.listeFils.get(i);
	}
	
	/**
	 * Methode setListeFils
	 * @param listeFils : liste de noeuds a mettre dans le noeud courant
	 */
	public void setListeFils(ArrayList<Noeud> listeFils) {
		this.listeFils = listeFils;
	}
	
	/**
	 * Methode affiche : Affiche l'arborescence de l'arbre et des noeuds
	 * @param rang : rang du noeud concerné
	 * @param last
	 * @param barre
	 */
	public void affiche(int rang, boolean last, ArrayList<Boolean> barre){
		String res = "";
		for(int i = 0; i < rang-1; i++){
			res += barre.get(i) ? "â”‚  " : "   ";
		}
		if(rang > 0)
			if(last)
				res += "â”” ";
			else 
				res += "â”œ ";
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
	 * Methode info
	 * @return String vide
	 */
	public String info() {
		return "";
	}


}
