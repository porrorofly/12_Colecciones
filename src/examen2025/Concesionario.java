
package examen2025;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jvega
 */
class Concesionario implements Serializable {
    private String nombre;
    private String ciudad;
    private List<Coche> coches;

    public Concesionario(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.coches = new ArrayList<>();
    }

    public void agregarCoche(Coche coche) {
        getCoches().add(coche);
    }

    public void mostrarCoches() {
        System.out.println("Concesionario: " + nombre + " - Ciudad: " + ciudad);
        for (Coche coche : getCoches()) {
            System.out.println(coche);
        }
    

            
    
    
    }

    /**
     * @return the coches
     */
    public List<Coche> getCoches() {
        return coches;
    }
    
    
}