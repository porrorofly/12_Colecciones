/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Contenedor_Lista;

import java.util.Arrays;

/**
 *
 * @author Mike
 */
public class Main_contener_12_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor<String> cString=new Contenedor<>(new String[0]);
        cString.insertarAlPrincipio("Uno");
        cString.insertarAlPrincipio("Dos");
        cString.insertarAlPrincipio("Cinco");
        for(String texto : cString.getObjetos()){
            System.out.println(texto + " ");
       }
        for(int i=0;i<cString.getObjetos().length;i++){
            System.out.println(cString.getObjetos()[i] + " ");
        }
        System.out.println(Arrays.toString(args));
    }//end main
    
}//end class
