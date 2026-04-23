/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExamenCollecciones2024;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mike
 */
public class ConjuntoOrdenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Set<String> conjunto=new LinkedHashSet<>();
        Scanner scanner=new Scanner(System.in);
        String texto=" ";
        for(int i=0;i<12;i++){
            System.out.println("Introduce un caracter: ");
            char caracter=scanner.next().charAt(0);
            texto+=caracter;
            if((i+1)%3==0){
                conjunto.add(texto);
                texto=" ";
            }
            
            
            
        }
        System.out.println("POr orden de inserción: " + conjunto);
        
        //orden Alfabetico
        Set<String> ordenNatural=new TreeSet<String>(conjunto);
      //  ordenNatural.addAll(conjunto);
        
        System.out.println("Orden alfabetico" + ordenNatural);
        
        
        Comparator<String> comparadorInverso=Comparator.reverseOrder();
//      Comparator<String> comparadorInverso=new Comparator<>(){
//          public int compare(String s1,String s2){
//              return s2.compareToIgnoreCase(s1);
//          }
//      };
       Set<String> ordenCompare=new TreeSet<String>(comparadorInverso);
       ordenCompare.addAll(conjunto);
      //  ordenNatural.addAll(conjunto);
        
        System.out.println("Orden inverso" + ordenCompare);
        
        
    }//end main
    
}//end class
