/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 * Los grados de visibilidad son: private, public, protected y default.
 * Los atributos son de visibilidad private.
 * @author User DANIELA JURADO
 */
public class Punto {
    
    private int x;
    private int y;    
    
    //Constructor por defecto.
    public Punto(){    
        this.x=0;    
        this.y=0;
        System.out.println("Objeto Creado");
    }
    
    public Punto(int x, int y){    
        this.x=x;    
        this.y=y;
        System.out.println("Objeto Creado");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
