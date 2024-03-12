/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author jeach
 */
public class Token {
    String Lexema;
    String tipo;
    int fila;
    int columna;
    
    public Token(String lexema, String tipo,int fila,int columna) {
        this.Lexema = lexema;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLexema() {
        return Lexema;
    }

    public void setLexema(String lexema) {
        this.Lexema = lexema;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
}
