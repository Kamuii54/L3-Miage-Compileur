package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.Iterator;
import java.util.Set;

import fr.ul.miage.groupe22.compilateur.environnement.Definition;
import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.ScopeGlobal;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;
import fr.ul.miage.groupe22.compilateur.environnement.Type;

/**
 * @author Groupe 22
 * Classe Fonction : Correspond à un noeud de type Fonction dans l'arbre
 */
public class Fonction extends Noeud {
	
	/**
	 * Constructeur
	 * @param idf  nom de la fonction
	 */
	public Fonction(String idf){
		super(idf);
	}
	
	/**
	 * Methode genererCode : genere le code assembleur correspondant au noeud
	 * @param tds : tables des symboles contenant variables/fonctions
	 * @param currentScope : correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";

		Symbole fonction = tds.getSymbole(this.getIdf(), currentScope);
		tds.pushCallStack(fonction);

		int nbVariable = Integer.parseInt(fonction.values.get("nbVariable"));
		resultat += "FUNC_" + this.getIdf() +" : \n"
				+ "\tPUSH(LP)\n"
				+ "\tPUSH(BP)\n"
				+ "\tMOVE(SP,BP)\n"
				+ "\tALLOCATE(" + fonction.values.get("nbVariable") + ") \n";
		resultat += this.genererData(tds, fonction.getScope());
		for (int i = 0; i < this.getListeFils().size(); i++) {
			if (this.getNoeud(i)==null) {
				System.out.println("Noeud null dans Fonction");
			}
			else resultat += this.getNoeud(i).genererCode(tds, fonction.getScope());
		}

		resultat += "ret_" + this.getIdf() + " : \n"
				+ "\tDEALLOCATE(" + nbVariable + ") \n" 
				+ "\tPOP(BP)\n"
				+ "\tPOP(LP)\n"
				+ "\tRTN()\n";
		tds.popCallStack();

		return resultat;
	}
	
	/**
	 * Methode genererData : genere le code assembleur correspondant aux declarations des variables de la fonction
	 * @param tds : tables des symboles contenant variables/fonctions
	 */
	private String genererData(TableDesSymboles tds, Scope scope) {
		StringBuilder resultat = new StringBuilder();
		Set<Definition> keys = tds.getTable().keySet();
		Iterator<Definition> it = keys.iterator();
		while (it.hasNext()) {
			Definition def = (Definition) it.next();
			if (def.getScope().equals(scope)) {
				Symbole symbole = tds.getSymbole(def);
				if (symbole.getType().equals(Type.INT)
						&& symbole.get("type").equals("local")) {
					if (symbole.getValues().containsKey("valeur defaut")) {
						resultat.append("\tCMOVE(" + symbole.getValues().get("valeur defaut") + ", r0)\n");
						resultat.append("\tPUTFRAME( R0, (1+"+symbole.get("rang")+")*(4))\n");
					}
				}
			}
		}
		return resultat.toString();
	}
	
	/**
	 * Methode toString : Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Fonction : "+ super.toString()+ " }- ";
	}
	
	/**
	 * Methode info
	 * @return String : nom de la fonction
	 */
	@Override
	public String info(){
		return this.getIdf();
	}

}
