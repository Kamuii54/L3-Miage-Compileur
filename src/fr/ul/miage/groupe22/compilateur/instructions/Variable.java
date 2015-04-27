package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.ScopeGlobal;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

/**
 * @author Groupe 22
 * Classe Variable : Correspond à un noeud de type Variable dans l'arbre
 */
public class Variable extends Noeud {

	/**
	 * Constructeur
	 * @param idf : nom de la variable
	 */
	public Variable(String idf){
		super(idf);
	}
	
	/**
	 * Methode genererCode : genere le code assembleur correspondant au noeud
	 * @param tds : tables des symboles contenant variables/fonctions
	 * @param currentScope : correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat ="";
		//recuperation du symbole correspondant a la variable
		Symbole s = tds.getSymbole(getIdf(), currentScope);
		//si il est déclaré de maniere global, placé dans r0
		if(s.getScope() == ScopeGlobal.getInstance()){
			resultat += "\tLD(" + this.getIdf() + ", r0) \n";
		//si c'est un parametre, recuperation dans la pile -> r0
		}else if(s.get("type") == "parametre"){
			resultat += "\tGETFRAME((2+"+s.get("rang")+")*(-4), R0)\n";
		//sinon (variable locale) recuperation dans la pile -> r0
		}else{
			resultat += "\tGETFRAME((1+"+s.get("rang")+")*(4), R0)\n";
		}
		//placement dans la pile
		resultat +=  "\tPUSH(r0)\n";
		return resultat;
	}
	
	/**
	 * Methode toString : Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Variable : "+ super.toString()+ " }- ";
	}

	/**
	 * Methode info
	 * @return String : nom de la variabl
	 */
	@Override
	public String info(){
		return this.getIdf();
	}
}
