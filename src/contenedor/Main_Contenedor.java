/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contenedor;

import java.util.Arrays;

/**
 *
 * @author Mike
 */
public class Main_Contenedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contenedor<String> contenedorTexto=new Contenedor<>();
        contenedorTexto.guardar("Hola");
        System.out.println(contenedorTexto.extraer());
        
        Contenedor<String[]> contenedorArrays=new Contenedor<>();
        String[] arrayTexti={"Hola","Mundo"};
        contenedorArrays.guardar(arrayTexti);
        System.out.println(Arrays.toString(contenedorArrays.extraer()));
        
        Contenedor<Integer> contenedorInt=new Contenedor<>();
        contenedorInt.guardar(17);
        
        
        ContenedorDoble<String,Double[]> doble=new ContenedorDoble();
        Double[] arrayDouble={12.,15.5,14.};
        doble.guardar("Hola",arrayDouble);
        
        for(double aux : arrayDouble){
            
//            if(aux==12.){
//                aux=0.;
//            }
            System.out.println(aux + ", ");
        }
        
        //2.01
        Contenedor<String[]> contenedorArrayTexto=new Contenedor<>();
        String[] nu={"Hola","papa"};
        contenedorArrayTexto.guardar(nu);
        System.out.println(contenedorTexto.extraer());
        
        
    }//end main
    
}//end class
