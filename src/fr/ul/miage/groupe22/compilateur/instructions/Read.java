package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 *  Correspond à un noeud de type Read dans l'arbre
 */
public class Read extends Noeud{

	/**
	 * Constructeur
	 */
	public Read(){
		super("read");
	}
	
	
	/**
	 * genere le code assembleur correspondant au noeud
	 * @param tds tables des symboles contenant variables/fonctions
	 * @param currentScope correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		//lecture de la valeur puis placement dans la pile
		String resultat ="\tRDINT() \n\tPUSH(r0) \n";
		return resultat;
	}
	
	/**
	 * Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Read : "+ super.toString()+ " }- ";
	}
	
}
