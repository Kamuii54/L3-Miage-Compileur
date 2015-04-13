package fr.ul.miage.groupe22.compilateur.generation;

import java.util.Iterator;
import java.util.Set;

import fr.ul.miage.groupe22.compilateur.environnement.Definition;
import fr.ul.miage.groupe22.compilateur.environnement.Global;
import fr.ul.miage.groupe22.compilateur.environnement.Noeud;
import fr.ul.miage.groupe22.compilateur.environnement.Symbole;
import fr.ul.miage.groupe22.compilateur.environnement.TableDesSymboles;
import fr.ul.miage.groupe22.compilateur.environnement.Type;

public class Generer {

	private Noeud parentInstruction ;
	private Symbole portee = Global.getInstance();
	
	public Generer()
	{
		
	}
	
	public String genererLeCode(Noeud arbre, TableDesSymboles tds)
	{
		String resultat = "";
		resultat += ".include beta.uasm \n"
				+ "CMOVE(pile,sp) \n"
				+ "BR(debut) \n";

		resultat += genererData(arbre, tds);
		resultat += "debut : \n"
				+ "CALL(main) \n"
				+ "HALT() \n";
		if(arbre.getListeFils() != null)
		{
			for(int i = 0; i < arbre.getListeFils().size(); i++)
			{
				parentInstruction = (Noeud) arbre.getListeFils().get(i);
				Definition def = new Definition(arbre.getReference().getIdentifiant(), Global.getInstance());
				this.portee = tds.getSymbole(def);
				resultat += genererLesFonctions(parentInstruction, tds);
			}
		}
		resultat += "pile : \n";
				
		return resultat;
	}
	
	private String genererLesFonctions(Noeud arbre, TableDesSymboles tds)
	{
		String resultat = "";
		
		int nbVariable = 0;
		resultat += arbre.getReference().getIdentifiant()
				+ " : PUSH(LP)\n"
				+ "MOVE(SP,BP)\n"
				+ "PUSH(BP)\n"
				+ "ALLOCATE(";
		if(tds.hasSymbole(arbre.getReference()))
		{
			nbVariable = Integer.parseInt(tds.getSymbole(arbre.getReference()).values.get("nbVariable"));
		}
			
		if(nbVariable != 0)
		{
				resultat += nbVariable;
		} else {
			resultat += "0";
		}
		resultat +=  ") \n";
		
		for(int i = 0; i < arbre.getListeFils().size(); i++)
		{
			Noeud fils = (Noeud)arbre.getListeFils().get(i);
			resultat += genererInstruction(fils, tds);
		}
		
		resultat += "ret_" + arbre.getReference().getIdentifiant() + " : \n"
				+ "DEALLOCATE(" + nbVariable
				+ ") \n"
				+ "POP(BP)\n"
				+ "POP(LP)\n"
				+ "RTN()\n";
			
		return resultat;
	}
	
	private String genererInstruction(Noeud arbre, TableDesSymboles tds)
	{
		String resultat = "";

		if(arbre.getTypeNoeud().equals("affectation"))
		{
			resultat += genererAffectation(arbre, tds);
		} else if(arbre.getTypeNoeud().equals("return"))
		{
			resultat += genererReturn(arbre, tds);	
		}
		
		return resultat;
	}
	
	private String genererAffectation(Noeud arbre, TableDesSymboles tds)
	{
		String resultat = "";
		Noeud filsGauche = null;
		Noeud filsDroit = null;
		
		int rang = 0;
		if(arbre.getListeFils().size() > 0)
		{
			filsDroit = (Noeud) arbre.getListeFils().get(1);
			filsGauche = (Noeud) arbre.getListeFils().get(0);
		}
		
		resultat += genererExpression(filsDroit, tds);
		if(filsGauche.getReference().getScope().equals(Global.getInstance()))
		{
			resultat += "POP(r0)\n"
					+ "ST(r0," + filsGauche.getReference().getIdentifiant() + ")\n";
		} else {
			int valeur = Integer.parseInt(tds.getSymbole(arbre.getReference()).values.get("rang"));
			int nbOctet = (1 + valeur) * 4;
			resultat += "PUTFRAME(r0," + nbOctet +")\n";
		}
		
		return resultat;
	}
	
	private String genererExpression(Noeud arbre, TableDesSymboles tds)
	{
		String resultat = "";
		if(arbre.getTypeNoeud().equals("constante"))
		{
			resultat += "CMOVE(" + arbre.getValeurNoeud() + ", r0)\n"
					+ "PUSH(r0)\n";
		} else if(arbre.getTypeNoeud().equals("variable"))
		{
			resultat += "LD(" + arbre.getReference().getIdentifiant() + ", r0)\n"
					+ "PUSH(r0)\n";
		} else if(arbre.getTypeNoeud().equals("addition"))
		{
			Noeud filsDroit = (Noeud) arbre.getListeFils().get(1);
			Noeud filsGauche = (Noeud) arbre.getListeFils().get(0);
			
			resultat += genererExpression(filsGauche, tds);
			resultat += genererExpression(filsDroit, tds);
			resultat += "POP(r2)\n"
					+ "POP(r1)\n"
					+ "ADD(r1,r2,r3)\n"
					+ "PUSH(r3)\n";
		} else if(arbre.getTypeNoeud().equals("multiplication"))
		{
			Noeud filsDroit = (Noeud) arbre.getListeFils().get(1);
			Noeud filsGauche = (Noeud) arbre.getListeFils().get(0);
			
			resultat += genererExpression(filsGauche, tds);
			resultat += genererExpression(filsDroit, tds);
			resultat += "POP(r2)\n"
					+ "POP(r1)\n"
					+ "MUL(r1,r2,r3)\n"
					+ "PUSH(r3)\n";
		} else if(arbre.getTypeNoeud().equals("division"))
		{
			Noeud filsDroit = (Noeud) arbre.getListeFils().get(1);
			Noeud filsGauche = (Noeud) arbre.getListeFils().get(0);
			
			resultat += genererExpression(filsGauche, tds);
			resultat += genererExpression(filsDroit, tds);
			resultat += "POP(r2)\n"
					+ "POP(r1)\n"
					+ "DIV(r1,r2,r3)\n"
					+ "PUSH(r3)\n";
		} else if(arbre.getTypeNoeud().equals("soustraction"))
		{
			Noeud filsDroit = (Noeud) arbre.getListeFils().get(1);
			Noeud filsGauche = (Noeud) arbre.getListeFils().get(0);
			
			resultat += genererExpression(filsGauche, tds);
			resultat += genererExpression(filsDroit, tds);
			resultat += "POP(r2)\n"
					+ "POP(r1)\n"
					+ "SUB(r1,r2,r3)\n"
					+ "PUSH(r3)\n";
		} else if(arbre.getTypeNoeud().equals("appel"))
		{
			int valeurNbVariable = Integer.parseInt(tds.getSymbole(arbre.getReference()).values.get("nbVariable"));
			resultat += "ALLOCATE(1)";
			
			for(int i = 0; i < arbre.getListeFils().size(); i++)
			{
				resultat += genererExpression((Noeud)arbre.getListeFils().get(i), tds);
			}
			
			resultat += "CALL(" + arbre.getReference().getIdentifiant() + ")"
					+ "DEALLOCATE(" + valeurNbVariable
					+ ")";
		}
		return resultat;
	}
	
	private String genererData(Noeud arbre, TableDesSymboles tds)
	{
		String resultat = "";
		Set keys = tds.getTable().keySet();
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			Definition def = (Definition) it;
			if(def.getScope().equals(Global.getInstance()) && 
					def.getScope().getType().equals(Type.INT)
					&& def.getScope().getValues().get("type").equals("variable"))
			{
				resultat += def.getIdentifiant() + " : LONG(";
				if(def.getScope().getValues().get("valeur default").equals("0"))
				{
					resultat += "#) \n";
				} else {
					resultat += def.getScope().getValues().get("valeur default");
				}
			}
		}
		
		return resultat;
	}
	
	private String genererReturn(Noeud arbre, TableDesSymboles tds)
	{
		String resultat = "";
		
		resultat += genererExpression((Noeud)arbre.getListeFils().get(0), tds);
		
		resultat += "POP(r0) \n"
				+ "PUTFRAME(r0, (3 + " + tds.getSymbole(parentInstruction.getReference()).getValues().get("nbParam")
				+ ")*4) \n"
								+ "BR(ret_" + parentInstruction.getReference().getIdentifiant() + ") \n";
		return resultat;
	}
}
