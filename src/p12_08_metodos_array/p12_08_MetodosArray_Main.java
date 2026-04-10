/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p12_08_metodos_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mike
 */
public class p12_08_MetodosArray_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        for(int i=0;i<20;i++){
            lista.add((int)(Math.random()*10+1));
        }
        System.out.println(lista);
        Integer[] arrayEnteros=lista.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrayEnteros));
        Arrays.sort(arrayEnteros);
        System.out.println(Arrays.toString(arrayEnteros));
        
        Collection<Integer> listaCreciente=new ArrayList<>();
        listaCreciente.addAll(Arrays.asList(arrayEnteros));
        System.out.println(listaCreciente);
        
        Comparator<Integer> ordenCreciente=new Comparator<>(){
            @Override
            public int compare(Integer num1, Integer num2) {
                   return num1-num2;
            }
            
        };
        lista.sort(ordenCreciente);
        System.out.println(lista);
    }//end main
    
}//end class
