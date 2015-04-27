/**
 * Classe qui appelle le parser
 * La lecture du flux de carractère se fait sur l'entréee standard
 */
package fr.ul.miage.groupe22.compilateur;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

import fr.ul.miage.groupe22.compilateur.generated.ParserCup;
import fr.ul.miage.groupe22.compilateur.generated.Yylex;

/**
 * Classe lancant le programme, prend au moins deux paramètres la source et la destination
 * @author Azim Roussanaly
 *
 */
public class Main {

	/**
	 * Lance le programme
	 * @param args pamaètres donné au programme
	 * @throws FileNotFoundException Fichier d'entrée non trouvé
	 */
	public static void main(String[] args) throws FileNotFoundException {
		boolean debug = false;
		boolean help = false;
		String fileIn = "test-suite/12-recursivite.miage";
		String fileOut = null;
		boolean in = true;
		boolean out = false;
		for(int i = 0; i < args.length; i++){
			switch(args[i]){
			case "-debug":
				debug = true;
				break;
			case "-help":
				help = true;
				break;
			default:
				if(args[i].startsWith("-")){
					System.out.println("Option " + args[i] +" non reconnu");
					help = true;
				}else{
					if(in){
						fileIn = args[i];
						in = false;
						out = true;
					}else{
						if(out){
							fileOut = args[i];
							out = false;
						}else{
							System.out.println("Option " + args[i] +" non reconnu");
							help = true;
						}
					}
				}
				break;
			}
		}
		if(help){
			System.out.println("Utilisation : java Main [-debug] source [destination]");
			System.exit(0);
		}
		long time = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream(fileIn);
		ParserCup parser = new ParserCup(new Yylex(fis));
		try {
			parser.parse();
			if(debug){
				parser.affiche();
			}
			if(fileOut != null){
				FileWriter fw = new FileWriter(fileOut);
				fw.write(parser.generate());
				fw.flush();
				fw.close();
			}else{
				System.out.println(parser.generate());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("...Erreur de syntaxe ");
		}
		System.out.println("Temps : " + (System.currentTimeMillis() - time) + " ms");
		
	}
}