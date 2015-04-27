package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.ArrayList;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 * Classe Container : Correspond à une liste de noeuds
 */
public class Container extends Noeud{

	/**
	 * Constructeur
	 */
	public Container(){	
	}
	
	/**
	 * Constructeur
	 * @param fils : liste des noeuds fils de ce noeud
	 */
	public Container(ArrayList<Noeud> fils) {
		this.setListeFils(fils);
	}

	/**
	 * Methode genererCode : genere le code assembleur correspondant au noeud
	 * @param tds : tables des symboles contenant variables/fonctions
	 * @param currentScope : correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		for (int i = 0; i < this.getListeFils().size(); i++) {
			//on genere le code pour l'ensemble des noeuds fils
			resultat += this.getNoeud(i).genererCode(tds, currentScope);
		}
		return resultat;
	}
	
	/**
	 * Methode toString : Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Container : "+ super.toString()+ " }- ";
	}

}
