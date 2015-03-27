package fr.ul.miage.groupe22.compilateur.test;

import java.io.FileInputStream;

import org.junit.Test;

import fr.ul.miage.groupe22.compilateur.generated.ParserCup;
import fr.ul.miage.groupe22.compilateur.generated.Yylex;

public class TestSuite{

	@Test
	public void test_01_minimal() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/01-minimal.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_02_global() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/02-global.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}
	
	@Test
	public void test_03_expression() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/03-expression.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_04_expression() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/04-expression.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_05_expression() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/05-expression.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_06_local() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/06-local.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_07_parametre() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/07-parametre.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_08_fonction() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/08-fonction.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_09_fonction() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/09-fonction.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_10_conditionnelle() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/10-conditionnelle.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_11_iteration() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/11-iteration.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_12_recursivite() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/12-recursivite.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_13_err1() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/13-err1.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_14_err2() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/14-err2.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_15_err3() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/15-err3.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_16_err4() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/16-err4.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_17_err5() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/17-err5.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}

	@Test
	public void test_00_syntaxe() throws Exception {
		FileInputStream fis = new FileInputStream("test-suite/00-syntaxe.miage");
		ParserCup parser = new ParserCup(new Yylex(fis));
		parser.parse();
	}


}
