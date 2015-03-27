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
		FileInputStream fis = new FileInputStream("test-suite/00-syntaxe.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		try {
			parser.parse();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("...Erreur de syntaxe ");
			System.exit(1);
		}
		
	}
}