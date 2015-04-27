package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 *  Correspond à un noeud de type Constante dans l'arbre
 */
public class Constante extends Noeud {
	
	private int valeur;

	/**
	 * Constructeur
	 * @param valeur int correspondant a la valeur de la onstante
	 */
	public Constante(int valeur){
		this.valeur = valeur;
	}

	/**
	 * genere le code assembleur correspondant au noeud
	 * @param tds tables des symboles contenant variables/fonctions
	 * @param currentScope correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		//on place la valeur dans R0 puis dans la pile
		return 	"\tCMOVE(" + this.valeur + ", r0)\n" + "\tPUSH(r0)\n";
	}
	
	/**
	 * Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Constante : "+ super.toString()+ " }- ";
	}
	
	/**
	 * 
	 * @return Valeur de la constante
	 */
	@Override
	public String info(){
		return ""+this.valeur;
	}

	/**
	 * 
	 * @return Valeur de la constante
	 */
	public int getValue() {
		return this.valeur;
	}
}
