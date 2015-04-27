package fr.ul.miage.groupe22.compilateur.instructions;

import java.util.Iterator;
import java.util.Set;

import fr.ul.miage.groupe22.compilateur.environnement.Definition;
import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.ScopeGlobal;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;
import fr.ul.miage.groupe22.compilateur.environnement.Type;

public class Root extends Noeud {

	/**
	 * Methode genererCode : genere le code assembleur correspondant au noeud
	 * @param tds : tables des symboles contenant variables/fonctions
	 * @param currentScope : correpond à l'emplacement de génération du code
	 */
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		//generation des instructions de démarrages
		resultat += ".include beta.uasm \n"
				+ ".include intio.uasm \n"
				+ ".options tty \n\n"
				+ "CMOVE(pile,sp) \n"
				+ "BR(debut) \n";

		//generation du code pour les  symboles du tds
		resultat += genererData(tds);
		//appel de la fonction main
		resultat += "debut : \n" + "\tCALL(FUNC_main) \n" + "\tHALT() \n";
		for (int i = 0; i < this.getListeFils().size(); i++) {
			//generation du code pour chaque noeud
			resultat += this.getNoeud(i).genererCode(tds, currentScope);
		}

		resultat += "pile : \n";

		return resultat;
	}

	/**
	 * Methode toString : Affichage du noeud en question
	 */
	@Override
	public String toString() {
		return " -Root : "+ super.toString()+ " }- ";
	}
	
	/**
	 * Methode genererData : genere le code assembleur correspondant aux declarations des variables/fonctions
	 * @param tds : tables des symboles contenant variables/fonctions
	 */
	private String genererData(TableDesSymboles tds) {
		StringBuilder resultat = new StringBuilder();
		Set<Definition> keys = tds.getTable().keySet();
		Iterator<Definition> it = keys.iterator();
		//boucle sur les symboles
		while (it.hasNext()) {
			Definition def = (Definition) it.next();
			//si le symbole est declaré de maniere global
			if (def.getScope().equals(ScopeGlobal.getInstance())) {
				Symbole symbole = tds.getSymbole(def);
				//si c'est une variable entiere
				if (symbole.getType().equals(Type.INT)
						&& symbole.get("type").equals("variable")) {
					resultat.append(def.getIdentifiant() + " : LONG(");
					if (symbole.getValues().containsKey("valeur defaut")) {
						resultat.append(symbole.getValues().get("valeur defaut") + ") \n");
					}else{
						resultat.append("0) \n");
					}
				}
			}
		}

		return resultat.toString();
	}

}
