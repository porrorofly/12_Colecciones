/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenedor;

/**
 *
 * @author Mike
 */
public class Contenedor <T> {
    private T objeto;
    public Contenedor(){
        
    }
    void guardar(T objeto){
    this.objeto=objeto;
    }
    T extraer(){
        T resultado=objeto;
        objeto=null;
        return resultado;
    }
  
    
}//end class