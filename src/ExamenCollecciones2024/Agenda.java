/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenCollecciones2024;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mike
 */
public class Agenda {
    private List<Contacto> contactos;
    private Set<String> eliminados;
    Scanner sc=new Scanner(System.in);
    public Agenda() {
        this.contactos = new ArrayList<>();
        this.eliminados =new LinkedHashSet<>();
        
    }
    public void anadir(){
        System.out.println("Introduce el nombre del contacto");
        String nombre=sc.nextLine();
        
        Contacto contactoExistente=buscarContactoPorNombre(nombre);
        
        
        
        
        if(contactoExistente!=null){
            System.out.println("EL contacto ya existe,quieres cambiar el telefono?");
            String respuesta=sc.nextLine();
            if(respuesta.equalsIgnoreCase("si"));
            System.out.println("Llamamos al metodo de modificar");;
        }
        else{
            System.out.println("Introduce el telefono");
            Integer telefono=Integer.parseInt(sc.nextLine());
            contactos.add(new Contacto(nombre,telefono));
        }
        
        
    }
    
    public Contacto buscarContactoPorNombre(String nombre){
        for(Contacto c: contactos){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return c;
            }
        }return null;
    }
    
    public void eliminar(){
        System.out.println("Introduce el nombre a eliminar");
        String nombre=sc.nextLine();
        Contacto contactoExistente=buscarContactoPorNombre(nombre);
        if(contactoExistente==null){
            System.out.println("No existe el contacto");
        }
        else{
            eliminados.add(contactoExistente);
            contactos.remove(contactoExistente);
            
        }
        
    }
    
}//end class
