/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenedor_interfaz_pila;

import java.util.Arrays;

/**
 *
 * @author Mike
 */
public class Contenedor <T extends Comparable<T> implements Pila<T>{
    private T[] arrayObjetos;

    public Contenedor(T[] arrayObjetos) {
        this.arrayObjetos = arrayObjetos;
    }
    

    @Override
    public void push(T nuevo) {
        this.arrayObjetos=Arrays.copyOf(arrayObjetos, arrayObjetos.length+1);
        arrayObjetos[arrayObjetos.length-1]=nuevo;
        
          }

    @Override
    public String toString() {
        String resultado=" ";
        for(int i=0;i<arrayObjetos.length;i++){
            resultado+=arrayObjetos[i] + " ";
        }
        return resultado;
    }

    @Override
    public T pop() {
        T aux=arrayObjetos[arrayObjetos.length-1];
        T[]arrayAux=Arrays.copyOf(arrayObjetos, arrayObjetos.length-1);
        arrayObjetos=arrayAux;
        return aux;
     }

    @Override
    public T peek() {
        
     }
}//end class
