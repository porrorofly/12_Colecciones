/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_A12_09_Interfaz_list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mike
 */
public class A12_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> Lista = new ArrayList<>() ;
        System.out.println("Introduce los numeros ,si quiere parar ,introduce un numero negativo");
        Integer numero=sc.nextInt();
        while(numero>0){
            Lista.add(numero);
            System.out.println("Introduce los numeros ,si quiere parar ,introduce un numero negativo");
            numero=sc.nextInt();
        }
        
        for(int i=0;i<Lista.size();i++){
            if(Lista.get(i)%2==0){
                System.out.print(i + " ");
            }
        }
        for(int i=0;i<Lista.size();i++){
            Lista.set(i, Lista.get(i)*100);
            
          
        }
        System.out.println("");  
        System.out.println(Lista);
            
    }//end class
    
}//end main
