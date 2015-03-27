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
val 	 = [0-9]+
name     =   [a-zA-Z0-9]+
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
"<"				{return new Symbol(ParserSym.INFERIEUR);}
">"				{return new Symbol(ParserSym.SUPERIEUR);}  
{val}			{return new Symbol(ParserSym.VAL, yytext());}
{name} 			{return new Symbol(ParserSym.NAME, yytext());}
{RC}			{;}
{comment} 		{;}
{SEP}      		{;}
.				{return null;}

