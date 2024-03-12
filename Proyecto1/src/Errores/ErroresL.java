/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Errores;

/**
 *
 * @author jeach
 */
public class ErroresL {
    String tipo;
    String caracter;
    int fila;
    int columna;
    
    public ErroresL(String tipo, String caracter,int fila,int columna) {
        this.tipo = tipo;
        this.caracter = caracter;
        this.fila = fila;
        this.columna = columna;
    }
    
    public void SendError(){
        System.out.println("Hubo un error de  tipo" + tipo);
        System.out.println("No se esparaba el caracter" + caracter);
        System.out.println("En la fila" + fila);
        System.out.println("En la columna" + columna);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return caracter;
    }

    public void setDescripcion(String descripcion) {
        this.caracter = descripcion;
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
