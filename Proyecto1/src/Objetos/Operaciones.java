/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import proyecto1.Principal;
/**
 *
 * @author jeach
 */
public class Operaciones {
    String tipo;
    Object dato1;
    Object dato2;

    public Operaciones(String tipo, Object dato1, Object dato2) {
        this.tipo = tipo;
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.getResult();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDato1() {
        return (int) dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public int getDato2() {
        return (int) dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }
    
    public int getResult(){
        int res = 0;
        if (this.tipo == "SUM") {
            res = (int) this.dato1 + (int) this.dato2;
            Principal.Prints.add(res);
            return res;  
        }else if(this.tipo == "RES"){
            res = (int) this.dato1 - (int) this.dato2;
            Principal.Prints.add(res);
            return res;
        }else if(this.tipo == "MUL"){
            res = (int) this.dato1 * (int) this.dato2;
            Principal.Prints.add(res);
            return res;
        }else if(this.tipo == "DIV"){
            res = (int) this.dato1 / (int) this.dato2;
            Principal.Prints.add(res);
            return res;
        }else if(this.tipo == "MOD"){
            res = (int) this.dato1 % (int) this.dato2;
            Principal.Prints.add(res);
            return res;
        } 
        return res; 
    }
    
}
