/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class e12_06_colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        System.out.println(lista);
        System.out.println("Introducir un numero real(0 para terminar)");
        Integer dato=new Scanner(System.in).useLocale(Locale.US).nextInt();
        while(!dato.equals(0)){//el bucle se para si el dato=0
            
            System.out.println("Introducir un numero real(0 para terminar)");
            dato=new Scanner(System.in).useLocale(Locale.US).nextInt();
            
        }//end while
        int contador=0;
        
        while(lista.remove((Integer)7)){
            contador++;
        }
        System.out.println("el numero 7 se ha encontrado " + contador  + " veces");
        for(Iterator<Integer> it=lista.iterator(); it.hasNext(); ){
            if(it.next()==4){
                
            }
        }
    }//end main
    
}//end class
