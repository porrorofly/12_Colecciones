/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class RecorrerColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<Double> positivos=new ArrayList<>();
        Collection<Double> negativos=new ArrayList<>();
        System.out.println("Introducir un numero real(0 para terminar)");
        Double dato=new Scanner(System.in).useLocale(Locale.US).nextDouble();//importante
        while(!dato.equals(0.)){//el bucle se para si el dato=0
            if(dato>0){
                positivos.add(dato);
            }else{
                negativos.add(dato);
            }
            System.out.println("Introducir un numero real(0 para terminar)");
            dato=new Scanner(System.in).useLocale(Locale.US).nextDouble();
            
        }//end while
        System.out.println("Coleccion de Positivos: " + positivos);
        System.out.println("Coleccion de Negativos: " + negativos);
        
        
        //declaro un iterador
        Iterator<Double> it= positivos.iterator();
        //recorro con un while
        while(it.hasNext()){
            Double auxDouble=it.next();
            if(auxDouble%3==0){
                it.remove();
            }
            
        }
        
        System.out.println("Colección sin múltiplos de 3" + positivos);
        it= negativos.iterator();
        //recorro con un while
        while(it.hasNext()){
            Double auxDouble=it.next();
            if(auxDouble%2==0){
                it.remove();
            }
            
        }
        System.out.println("Colección sin múltiplos de 2" + negativos);
    }//end main
    
}//end class
