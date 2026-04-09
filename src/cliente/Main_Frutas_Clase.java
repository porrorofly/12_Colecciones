/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import java.util.ArrayList;

/**
 *
 * @author Mike
 */
public class Main_Frutas_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> frutas=new ArrayList<>();
        //métodos básicos 
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Kiwi");
        
//        System.out.println(frutas);
//        //remove
//        //boolean remove(Object ob)
//        System.out.println(frutas.remove("Platano"));
//        System.out.println(frutas);
//        
//        //void clear()
//        frutas.clear();
//        System.out.println(frutas);
//        //isEmpty
//        System.out.println(frutas.isEmpty());
//        frutas.add("Kiwi");
//        System.out.println(frutas.isEmpty());
//        
//        //boolean contains(Object o)
//        System.out.println(frutas.contains("Kiwi"));
//        System.out.println(frutas.contains("Pera"));
//        frutas.add("Platano");
//        
//        //int size()
//        System.out.println(frutas.size());
//        
        //metodos Globales
        ArrayList<String> frutasExoticas=new ArrayList<>();
        //métodos básicos 
        frutasExoticas.add("Mango");
        frutasExoticas.add("Piña");
        frutasExoticas.add("Maracuya");
        frutas.add("Mango");
        frutas.add("Piña");
        System.out.println(frutas);
        System.out.println(frutasExoticas);
        
        
        //boolean containsAll(Collection<?> c)
        System.out.println(frutasExoticas.containsAll(frutas));
        System.out.println(frutas.containsAll(frutasExoticas));
        
        //boolean addAll(Collection<? extend E> c)
        ArrayList<String> frutasSosas=new ArrayList<>();
        frutasSosas.add("Lichi");
        frutasSosas.add("Pitaya");
        
        
        frutas.addAll(frutasSosas);
        System.out.println(frutas);
        frutas.addAll(frutasExoticas);
        System.out.println(frutas);
        System.out.println(frutasExoticas);
       //removeAll
       frutas.removeAll(frutasExoticas);
       System.out.println(frutas);
       
       
//       //retainAll
//       frutas.retainAll(frutasExoticas);
//        System.out.println(frutas);
    }//end main
    
}//end class
