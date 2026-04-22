/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2025;

/**
 *
 * @author Mike
 */
public class Herramienta {
    String nombre;
    int referencia;
    Double precio;
    int cantidadEnAlmacen;

    public Herramienta(String nombre, int referencia, Double precio, int cantidadEnAlmacen) {
        this.nombre = nombre;
        this.referencia = referencia;
        this.precio = precio;
        this.cantidadEnAlmacen = cantidadEnAlmacen;
    }

    @Override
    public String toString() {
        return "Herramienta{" + "nombre=" + nombre + ", referencia=" + referencia + ", precio=" + precio + ", cantidadEnAlmacen=" + cantidadEnAlmacen + '}';
    }

//    @Override
//    public boolean equals(Herramienta herramienta) {
//        return this.nombre.equals(herramienta); 
//    }
    
    
}
