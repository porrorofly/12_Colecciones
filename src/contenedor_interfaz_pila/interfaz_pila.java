/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contenedor_interfaz_pila;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 *
 * @author Mike
 */
public class interfaz_pila{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arrayEnteros={1,2,3,4};
        Pila<Integer> pila=new Contenedor<>(arrayEnteros);
        
        
        pila.push(9);
        System.out.println(pila);
        
      //  pila.pop();
        System.out.println(pila.pop());//elimina el último número
         System.out.println(pila);
 //       pila.peek();
        System.out.println(pila.peek());//lee el ultimo numero
         System.out.println(pila);
         Stack<Double> pilaHecha=new Stack<>();
         pilaHecha.push(7.3);
         pilaHecha.push(8.3);
         System.out.println(pilaHecha);
         
                 
                 
                 //creadción de la pila usadndo deque y arrayDeque
        Deque<String> pilaString=new ArrayDeque<>();
        pilaString.push("Tomate");
        pilaString.push("Papas");  
        pilaString.push("Platanos");
    }//end main
    
}//end class
