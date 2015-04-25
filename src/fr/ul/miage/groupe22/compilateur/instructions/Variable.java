package fr.ul.miage.groupe22.compilateur.instructions;

import fr.ul.miage.groupe22.compilateur.environnement.Scope;
import fr.ul.miage.groupe22.compilateur.environnement.ScopeGlobal;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;

public class Variable extends Noeud {

	public Variable(String idf){
		super(idf);
	}
	
	@Override
	public String genererCode(TableDesSymboles tds, Scope currentScope) {
		String resultat ="";
		Symbole s = tds.getSymbole(getIdf(), currentScope);
		if(s.getScope() == ScopeGlobal.getInstance()){
			resultat += "\tLD(" + this.getIdf() + ", r0) \n";
		}else if(s.get("type") == "parametre"){
			resultat += "\tGETFRAME((2+"+s.get("rang")+")*(-4), R0)\n";
		}else{
			resultat += "\tGETFRAME((1+"+s.get("rang")+")*(4), R0)\n";
		}
		resultat +=  "\tPUSH(r0)\n";
		return resultat;
	}
	
	@Override
	public String toString() {
		return " -Variable : "+ super.toString()+ " }- ";
	}

	@Override
	public String info(){
		return this.getIdf();
	}
}
