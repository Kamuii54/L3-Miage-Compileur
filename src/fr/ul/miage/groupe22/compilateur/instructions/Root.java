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

	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat = "";
		resultat += ".include beta.uasm \n"
				+ ".include intio.uasm \n"
				+ "option tty \n\n"
				+ "CMOVE(pile,sp) \n"
				+ "BR(debut) \n";

		resultat += genererData(tds);
		resultat += "debut : \n" + "CALL(main) \n" + "HALT() \n";
		for (int i = 0; i < this.getListeFils().size(); i++) {
			resultat += this.getNoeud(i).genererCode(tds, currentScope);
		}
		
		resultat += "pile : \n";

		return resultat;
	}
	
	private String genererData(TableDesSymboles tds) {
		StringBuilder resultat = new StringBuilder();
		Set<Definition> keys = tds.getTable().keySet();
		Iterator<Definition> it = keys.iterator();
		while (it.hasNext()) {
			Definition def = (Definition) it;
			if (def.getScope().equals(ScopeGlobal.getInstance())) {
				Symbole symbole = tds.getSymbole(def);
				if (symbole.getType().equals(Type.INT)
						&& symbole.get("type").equals("variable")) {
					resultat.append(def.getIdentifiant() + " : LONG(");
					if (symbole.get("valeur default").equals("0")) {
						resultat.append("#) \n");
					} else {
						resultat.append(symbole.getValues().get("valeur default"));
					}
				}
			}
		}

		return resultat.toString();
	}

}
