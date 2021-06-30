/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author User DANIELA JURADO
 */
public class Bicicleta {
    int numeroRin;
    String marca;
    double precio;
    int tamanio;
    String color;

    public Bicicleta() {
    }

    public Bicicleta(int numeroRin, String marca, double precio, int tamanio, String color) {
        this.numeroRin = numeroRin;
        this.marca = marca;
        this.precio = precio;
        this.tamanio = tamanio;
        this.color = color;
    }

    public Bicicleta(int i, String tundra, int i0, double d, int i1, String verde) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
