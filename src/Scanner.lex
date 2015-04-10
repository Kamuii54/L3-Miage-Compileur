/*
 * analyseur lexical du langage exemple-expr:
 * (voir support de cours CUP)
 *
 * auteur : azim.roussanaly@univ-lorraine.fr
 * (c) 2015
 */

package fr.ul.miage.groupe22.compilateur.generated;
import java_cup.runtime.Symbol;

%%

/* options */
%line
%public
%cupsym ParserSym
%cup
%debug

/* macros */
SEP      =   [ \t]
RC       =   "\n"|"\r\n"
const 	 =   [0-9]+
idf      =   [a-zA-Z0-9]+
comment  =   \/\*(([^*])|(\*[^/]))*\*\/ 


%%

/* regles */
"void"			{return new Symbol(ParserSym.VOID);}
"int"			{return new Symbol(ParserSym.INT);}
"("				{return new Symbol(ParserSym.PO);}
")"				{return new Symbol(ParserSym.PF);}
"{"				{return new Symbol(ParserSym.AO);} 
"}"				{return new Symbol(ParserSym.AF);} 
","				{return new Symbol(ParserSym.V);} 
";"				{return new Symbol(ParserSym.PV);} 
"="				{return new Symbol(ParserSym.E);} 
"+"				{return new Symbol(ParserSym.PLUS);} 
"-"				{return new Symbol(ParserSym.MOINS);} 
"*"				{return new Symbol(ParserSym.FOIS);} 
"/"				{return new Symbol(ParserSym.DIVISE);} 
"return"		{return new Symbol(ParserSym.RETURN);} 
"if"			{return new Symbol(ParserSym.IF);} 
"else"			{return new Symbol(ParserSym.ELSE);} 
"while"			{return new Symbol(ParserSym.WHILE);} 
"read"			{return new Symbol(ParserSym.READ);}
"write"			{return new Symbol(ParserSym.WRITE);}
"<"				{return new Symbol(ParserSym.INFERIEUR);}
">"				{return new Symbol(ParserSym.SUPERIEUR);}  
{const}			{return new Symbol(ParserSym.CONST, new Integer(yytext()));}
{idf} 			{return new Symbol(ParserSym.IDF, yytext());}
{RC}			{;}
{comment} 		{;}
{SEP}      		{;}
.				{return null;}

