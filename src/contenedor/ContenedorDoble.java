/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenedor;

/**
 *
 * @author Mike
 */
public class ContenedorDoble <T,V>{
    private T objeto1;
    private V objeto2;
    
    
    public ContenedorDoble(){
    }
    void guardar(T objeto1,V objeto2){
        this.objeto1=objeto1;
        this.objeto2=objeto2;
    }
//    void guardar(T objeto1){
//        this.objeto1=objeto1;
//       
//    }
    void guardar(V objeto2){
        this.objeto2=objeto2;
    }
    T extrar1(){
        T resultado=objeto1;
        objeto1=null;
        return resultado;
    }
    V extrar2(){
        V resultado=objeto2;
        objeto1=null;
        return resultado;
    }
}//end class
