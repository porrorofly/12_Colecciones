/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2025;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class GestionConcesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreConcesionario="Automax";
        String ciudad="La laguna";
        Concesionario concesionarioAutoMax=new Concesionario(nombreConcesionario,ciudad);
        BufferedReader in=null;
        String texto=" ";
        try{
            in =new BufferedReader(new FileReader("coches.txt"));
            String linea=in.readLine();
           
            String[] subcadena;
            while((linea=in.readLine()) !=null){
                texto+=linea+ "\n";
                subcadena= linea.split("::");
                
                if(subcadena.length==4){
                    int year=Integer.parseInt(subcadena[2]);
                    Double velMax=Double.parseDouble(subcadena[3]);
                    Coche coche=new Coche(subcadena[0],subcadena[1],year,velMax);
                    concesionarioAutoMax.agregarCoche(coche);
                }
            }
            
            
            concesionarioAutoMax.mostrarCoches();
    
            } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

        }
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Concesionario.dat"))){
            oos.writeObject(concesionarioAutoMax);
            System.out.println("El fichero escrito perfectamente");
        } catch (IOException ex) {
            System.out.println(ex.getMessage() + "Error de escitura");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

        }
    

    }//end main
    
}//end class
