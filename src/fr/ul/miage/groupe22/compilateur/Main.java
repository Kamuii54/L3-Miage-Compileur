/**
 * Classe qui appelle le parser
 * La lecture du flux de carractère se fait sur l'entréee standard
 */
package fr.ul.miage.groupe22.compilateur;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import fr.ul.miage.groupe22.compilateur.generated.ParserCup;
import fr.ul.miage.groupe22.compilateur.generated.Yylex;

/**
 * @author Azim Roussanaly
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		long time = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("test-suite/18-factoriel-recursif.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		try {
			parser.parse();
			//parser.affiche();
			//System.out.println("ok : \n\n\n"+parser.generate());
			System.out.println(parser.generate());
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("...Erreur de syntaxe ");
		}
		//System.out.println("Temps : " + (System.currentTimeMillis() - time) + " ms");
		
	}
}