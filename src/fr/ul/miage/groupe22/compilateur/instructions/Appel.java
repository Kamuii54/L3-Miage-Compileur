package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.ArrayList;
import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;
import fr.ul.miage.groupe22.compilateur.environnement.Type;

/**
 * @author Groupe 22
 *  Correspond � un noeud de type Appel dans l'arbre
 */
public class Appel extends Noeud {
	
	/**
	 * Constructeur
	 * @param idf identifiant de la fonction appel�e
	 */
	public Appel(String idf){
		super(idf);
	}

	/**
	 * Constructeur
	 * @param idf identifiant de la fonction appel�e
	 * @param fils liste des noeuds fils associ�s � l'appel
	 */
	public Appel(String idf, ArrayList<Noeud> fils) {
		super(idf);
		this.setListeFils(fils);
	}

	/**
	 * genere le code assembleur correspondant au noeud
	 * @param tds tables des symboles contenant variables/fonctions
	 * @param currentScope correpond � l'emplacement de g�n�ration du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		//recuperation du symbole correspondant a la fonction appel�
		Symbole sym = tds.getSymbole(getIdf(), currentScope);
		//nombre de parametre
		int nbAllocate = Integer.parseInt(sym.get("nbParam"));
		//si fonction de type int (valeur a retourner, allocation 1 place)
		if(sym.getType() == Type.INT)
			resultat += "\tALLOCATE(1) \n";
		//sinon pas d'allocation
		else
			resultat += "\tALLOCATE(0) \n";
		
		//generation du code des noeuds contenus dans l'appel
		for (int i = 0; i < this.getListeFils().size(); i++) {
			resultat += this.getNoeud(i).genererCode(tds, currentScope);
		}
		//appel de la fonction correspondante et mise a jour des allocations
		resultat += "\tCALL(FUNC_" + getIdf() + ") \n"
				+ "\tDEALLOCATE(" + nbAllocate + ") \n";
		return resultat;
	}
	
	/**
	 * Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Appel : "+ super.toString()+ " }- ";
	}
}
