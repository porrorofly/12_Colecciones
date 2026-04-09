/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenedor_Lista;

import java.util.Arrays;

/**
 *
 * @author Mike
 */
public class Contenedor <T>{
    private T[] objetos;

    public Contenedor() {
    }

    public Contenedor(T[] objetos) {
        this.objetos = objetos;
    }
    
    void insertarAlPrincipio(T nuevo){
     //   T[] auxArray=new T[objetos.length+1];
     objetos=Arrays.copyOf(objetos, objetos.length+1);
     for(int i=objetos.length-1;i>0;i--){
         objetos[i]=objetos[i-1];
     }
     objetos[0]= nuevo;
    }

    public T[] getObjetos() {
        return objetos;
    }

    public void setObjetos(T[] objetos) {
        this.objetos = objetos;
    }
    void insertarAlFinal(T nuevo){
     objetos=Arrays.copyOf(objetos, objetos.length+1);
     objetos[objetos.length-1]= nuevo;
    }
    
    
    
    
    
}//end class
