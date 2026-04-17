package examen2025;

import java.io.Serializable;

/**
 *
 * @author jvega
 */
class Coche implements Serializable {

    private String marca;
    private String modelo;
    private int año;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, int año, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "\t" + marca + " " + modelo + " (" + año + ") - Velocidad Máxima: " + velocidadMaxima + " km/h";
    }

}
