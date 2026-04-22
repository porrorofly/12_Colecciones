
package examen2025;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author  
 */

public class MainFerreteriaInput {
    public static void main(String[] args) {
         
        Set<Herramienta> herramientas=new TreeSet<>();
        
        Herramienta martillo = new Herramienta("Martillo", 101, 12.99, 10);
        Herramienta destornillador = new Herramienta("Destornillador", 102, 10.49, 20);
        Herramienta llaveInglesa = new Herramienta("Llave Inglesa", 103, 10.99, 15);
        Herramienta sierra = new Herramienta("Sierra", 104, 19.99, 8);
        Herramienta taladro = new Herramienta("Taladro", 105, 49.99, 5);
        Herramienta cintaMetrica = new Herramienta("Cinta métrica", 106, 10.99, 25);
        Herramienta pala1 = new Herramienta("Pala", 107, 14.99, 12);
        Herramienta pala2 = new Herramienta("Pala", 107, 4.99, 12);
        Herramienta pala3 = new Herramienta("Pala", 107, 14.99, 1);
        
        herramientas.add(martillo);
        herramientas.add(destornillador);
        herramientas.add(llaveInglesa);
        herramientas.add(sierra);
        herramientas.add(taladro);
        herramientas.add(cintaMetrica);
        herramientas.add(pala1);
        herramientas.add(pala2);
        herramientas.add(pala3);
        
    }


    
}
