/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mike
 */
public class TutorialConversionesClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> conjuntoEnteros=new LinkedHashSet<>();
        conjuntoEnteros.add(4);
        conjuntoEnteros.add(1);
        conjuntoEnteros.add(5);
        conjuntoEnteros.add(10);
        conjuntoEnteros.add(3);
        System.out.println("orden de insercion(LinkedHashSet)" + conjuntoEnteros);
        
        
        /*1.Ordenar mediante un TreeSet (Orden natural)*/
        Set<Integer> conjuntoEnterosOrdenados=new TreeSet<>();
        conjuntoEnterosOrdenados.addAll(conjuntoEnteros);
        System.out.println("Valores Treeset " + conjuntoEnterosOrdenados);
        
        conjuntoEnteros=conjuntoEnterosOrdenados;
        System.out.println("conjuntoEnteros después de bonle copnversivos: " + conjuntoEnteros);
        
        //Como reescibir el conjunto de enteros
        conjuntoEnteros.clear();
        conjuntoEnteros.addAll(conjuntoEnterosOrdenados);
        
        /*2.Ordenar mediante un TreeSet (Orden específico)*/
        //Declaro un comparador
        Comparator<Cliente1> comparaNombre=Comparator.comparing(Cliente1::getNombre);
        Set<Cliente1> conjuntoclientes=new LinkedHashSet<>();
        conjuntoclientes.add(new Cliente1("111","Marta","12/02/2000"));
        conjuntoclientes.add(new Cliente1("115","Jorge","12/03/1999"));
        conjuntoclientes.add(new Cliente1("112","Carlos","02/02/2002"));
        
        System.out.println("LinkedHashSet conjuntoCLientes " + conjuntoclientes);
        Set<Cliente1> conjuntoClientesOrdenados=new TreeSet<>(comparaNombre);
        conjuntoClientesOrdenados.addAll(conjuntoclientes);
        
        //CONVERSIONES ENTRE TODO TIPO DE COLECCIONES
        List<Integer> lista=new ArrayList<>();
        lista.add(3);
        lista.add(5);
        lista.add(2);
        lista.add(5);
        System.out.println("Vista del ArrayList: " + lista);
        
        //convierto una lista en un conjunto
        Set<Integer> conjunto=new LinkedHashSet<>(lista);
        
        System.out.println("Vista de la lista convertida en conjunto: " + conjunto);
        
        //Vuelvo a convertir el conjunto en una lista
        lista=new ArrayList(conjunto);
        
        System.out.println("Vista del ArrayList sin duplicados" + lista);
        
        
        Collection<Integer> coleccion=new ArrayList<>();
        coleccion.add(5);
        coleccion.add(3);
        coleccion.add(7);
        coleccion.add(7);
        
        //paso de lista a conjunto
        coleccion=new LinkedHashSet(coleccion);
        System.out.println("Coleccion(Set)" + coleccion);
        
        //paso de conjunto a lista
        coleccion=new ArrayList<>(coleccion);
        
        //En un solo paso: Coleccion->Set->Lista
        //coleccion=new ArrayList<>(new LinkedHashSet<>(coleccion));
        
    }//end main
    
}//end class
