/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author jeach
 */
public class graphBar {
    String titulo;
    public ArrayList <String> ejeX = new ArrayList<>();
    public ArrayList <Integer> ejeY = new ArrayList<>();
    String tituloX;
    String tituloY;
    
    public graphBar(String titulo, String tituloX, String tituloY) {
        this.titulo = titulo;
        this.tituloX = tituloX;
        this.tituloY = tituloY;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getTituloX() {
        return tituloX;
    }
    
    public String getTituloY() {
        return tituloY;
    }

    public void setTitulo(String tipo) {
        this.titulo = tipo;
    }
    
    public void addX(String val){
        this.ejeX.add(val);
    }
    
    public void addy(int val){
        this.ejeY.add(val);
    }
}
