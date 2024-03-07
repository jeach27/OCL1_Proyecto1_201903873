/*--------------------------------------------------
 ------------  1ra Area: Codigo de Usuario ---------
 ---------------------------------------------------*/

//------> Paquetes,importaciones
package Analizadores;
import Errores.ErroresL;
import java_cup.runtime.*;
import javax.swing.JOptionPane;

/*----------------------------------------------------------
  ------------  2da Area: Opciones y Declaraciones ---------
  ----------------------------------------------------------*/
%%
%{
    //----> Codigo de usuario en sintaxis java
%}

//-------> Directivas
%public 
%class Analizador_Lexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode

//------> Expresiones Regulares

digito = [0-9]
letra = [a-z]
cadena = [\"][^\"\n]+[\"]
double = [+-]? {digito}* [\.]? {digito}+
id = {letra}({letra}|{ digito }|_)*


LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]


comentariosimple    = "!" {InputCharacter}* {LineTerminator}?
comentarioMulti =  "<!" [^/] ~"!>"

//------> Estados

%%

/*------------------------------------------------
  ------------  3ra Area: Reglas Lexicas ---------
  ------------------------------------------------*/

//-----> Simbolos

“:”         { System.out.println("Reconocio "+yytext()+" DosPuntos"); return new Symbol(Simbolos.DosPuntos, yycolumn, yyline, yytext()); }
“<”         { System.out.println("Reconocio "+yytext()+" menor"); return new Symbol(Simbolos.menor, yycolumn, yyline, yytext()); }
“>”         { System.out.println("Reconocio "+yytext()+" mayor"); return new Symbol(Simbolos.mayor, yycolumn, yyline, yytext()); }
“-”         { System.out.println("Reconocio "+yytext()+" guion"); return new Symbol(Simbolos.guion, yycolumn, yyline, yytext()); }
“;”         { System.out.println("Reconocio "+yytext()+" PuntoComa"); return new Symbol(Simbolos.PuntoComa, yycolumn, yyline, yytext()); }
“[”         { System.out.println("Reconocio "+yytext()+" AbreC"); return new Symbol(Simbolos.AbreC, yycolumn, yyline, yytext()); }
“]”         { System.out.println("Reconocio "+yytext()+" CierraC"); return new Symbol(Simbolos.CierraC, yycolumn, yyline, yytext()); }
“@”         { System.out.println("Reconocio "+yytext()+" arroba"); return new Symbol(Simbolos.arroba, yycolumn, yyline, yytext()); }
“,”         { System.out.println("Reconocio "+yytext()+" Coma"); return new Symbol(Simbolos.Coma, yycolumn, yyline, yytext()); }
“(”         { System.out.println("Reconocio "+yytext()+" AbreP"); return new Symbol(Simbolos.AbreP, yycolumn, yyline, yytext()); }
“)”         { System.out.println("Reconocio "+yytext()+" CierraP"); return new Symbol(Simbolos.CierraP, yycolumn, yyline, yytext()); }

 
//-----> Palabras reservadas

"Program"       { System.out.println("Reconocio "+yytext()+" Program"); return new Symbol(Simbolos.Program, yycolumn, yyline, yytext()); }
"End Program"   { System.out.println("Reconocio "+yytext()+" End Program"); return new Symbol(Simbolos.endProgram, yycolumn, yyline, yytext()); }
"Var"           { System.out.println("Reconocio "+yytext()+" var"); return new Symbol(Simbolos.var, yycolumn, yyline, yytext()); }
"End"           { System.out.println("Reconocio "+yytext()+" end"); return new Symbol(Simbolos.end, yycolumn, yyline, yytext()); }
"Double"        { System.out.println("Reconocio "+yytext()+" double"); return new Symbol(Simbolos.double, yycolumn, yyline, yytext()); }
"Char"          { System.out.println("Reconocio "+yytext()+" char"); return new Symbol(Simbolos.char, yycolumn, yyline, yytext()); }
"Arr"           { System.out.println("Reconocio "+yytext()+" arr"); return new Symbol(Simbolos.arr, yycolumn, yyline, yytext()); }
"SUM"           { System.out.println("Reconocio "+yytext()+" SUM"); return new Symbol(Simbolos.SUM, yycolumn, yyline, yytext()); }
"RES"           { System.out.println("Reconocio "+yytext()+" RES"); return new Symbol(Simbolos.RES, yycolumn, yyline, yytext()); }
"MUL"           { System.out.println("Reconocio "+yytext()+" MUL"); return new Symbol(Simbolos.MUL, yycolumn, yyline, yytext()); }
"DIV"           { System.out.println("Reconocio "+yytext()+" DIV"); return new Symbol(Simbolos.DIV, yycolumn, yyline, yytext()); }
"MOD"           { System.out.println("Reconocio "+yytext()+" MOD"); return new Symbol(Simbolos.MOD, yycolumn, yyline, yytext()); }
"Media"         { System.out.println("Reconocio "+yytext()+" Media"); return new Symbol(Simbolos.Media, yycolumn, yyline, yytext()); }
"Mediana"       { System.out.println("Reconocio "+yytext()+" Mediana"); return new Symbol(Simbolos.Mediana, yycolumn, yyline, yytext()); }
"Moda"          { System.out.println("Reconocio "+yytext()+" Moda"); return new Symbol(Simbolos.Moda, yycolumn, yyline, yytext()); }
"Varianza"      { System.out.println("Reconocio "+yytext()+" Varianza"); return new Symbol(Simbolos.varianza, yycolumn, yyline, yytext()); }
"Max"           { System.out.println("Reconocio "+yytext()+" MAX"); return new Symbol(Simbolos.max, yycolumn, yyline, yytext()); }
"Min"           { System.out.println("Reconocio "+yytext()+" MIN"); return new Symbol(Simbolos.min, yycolumn, yyline, yytext()); }
"Console"       { System.out.println("Reconocio "+yytext()+" Console"); return new Symbol(Simbolos.Console, yycolumn, yyline, yytext()); }
"Print"         { System.out.println("Reconocio "+yytext()+" print"); return new Symbol(Simbolos.print, yycolumn, yyline, yytext()); }
"Column"        { System.out.println("Reconocio "+yytext()+" column"); return new Symbol(Simbolos.column, yycolumn, yyline, yytext()); }
"EXEC"          { System.out.println("Reconocio "+yytext()+" EXEC"); return new Symbol(Simbolos.exec, yycolumn, yyline, yytext()); }
"graphBar"      { System.out.println("Reconocio "+yytext()+" graphBar"); return new Symbol(Simbolos.graphBar, yycolumn, yyline, yytext()); }
"graphPie"      { System.out.println("Reconocio "+yytext()+" graphPie"); return new Symbol(Simbolos.graphPie, yycolumn, yyline, yytext()); }
"graphLine"     { System.out.println("Reconocio "+yytext()+" graphLine"); return new Symbol(Simbolos.graphLine, yycolumn, yyline, yytext()); }
"Histogram"     { System.out.println("Reconocio "+yytext()+" Histogram"); return new Symbol(Simbolos.Histogram, yycolumn, yyline, yytext()); }
"values"        { System.out.println("Reconocio "+yytext()+" values"); return new Symbol(Simbolos.values, yycolumn, yyline, yytext()); }
"label"         { System.out.println("Reconocio "+yytext()+" label"); return new Symbol(Simbolos.label, yycolumn, yyline, yytext()); }
"Titulo"        { System.out.println("Reconocio "+yytext()+" Titulo"); return new Symbol(Simbolos.titulo, yycolumn, yyline, yytext()); }
"ejeX"          { System.out.println("Reconocio "+yytext()+" ejeX"); return new Symbol(Simbolos.ejeX, yycolumn, yyline, yytext()); }
"ejeY"          { System.out.println("Reconocio "+yytext()+" ejeY"); return new Symbol(Simbolos.ejeY, yycolumn, yyline, yytext()); }
"tituloX"       { System.out.println("Reconocio "+yytext()+" tituloX"); return new Symbol(Simbolos.tituloX, yycolumn, yyline, yytext()); }
"tituloY"       { System.out.println("Reconocio "+yytext()+" tituloY"); return new Symbol(Simbolos.tituloY, yycolumn, yyline, yytext()); }


//-------> Simbolos ER
{digito}    { System.out.println("Reconocio "+yytext()+" digito"); return new Symbol(Simbolos.digito, yycolumn, yyline, yytext()); }
{letra}    { System.out.println("Reconocio "+yytext()+" letra"); return new Symbol(Simbolos.letra, yycolumn, yyline, yytext()); }
{esp}    { System.out.println("Reconocio "+yytext()+" esp"); return new Symbol(Simbolos.esp, yycolumn, yyline, yytext()); }
{cadena}    { System.out.println("Reconocio "+yytext()+" cadena"); return new Symbol(Simbolos.cadena, yycolumn, yyline, yytext()); }
{id}    { System.out.println("Reconocio "+yytext()+" id"); return new Symbol(Simbolos.id, yycolumn, yyline, yytext()); }

//------> Espacios
{comentariosimple}      {System.out.println("Comentario: "+yytext()); }
{comentarioMulti}      {System.out.println("Comentario: "+yytext()); }
[ \t\r\n\f]             {/* Espacios en blanco, se ignoran */}

//------> Errores Lexicos
.                       { ErroresL err = new ErroresL("Lexico",yytext(), yyline, yycolumn); err.SendError();}


