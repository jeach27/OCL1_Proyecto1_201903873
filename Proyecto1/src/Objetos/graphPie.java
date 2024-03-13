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
public class graphPie {
    
    String titulo;
    public ArrayList <String> values = new ArrayList<>();
    public ArrayList <String> labels = new ArrayList<>();
    
    public graphPie(String titulo, ArrayList values, ArrayList labels) {
        this.titulo = titulo;
        this.values = values;
        this.labels = labels;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tipo) {
        this.titulo = tipo;
    }
    
    public void addVal(String val){
        this.values.add(val);
    }
    
    public void addLab(String lab){
        this.labels.add(lab);
    }
}
