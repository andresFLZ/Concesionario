/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author lenovo
 */
public class Fiesta extends Auto{
    
    static private Fiesta fiesta = null; 
    
    private Fiesta(){}
    
    //Singleton
    public static Fiesta getInstance(){
        if(fiesta == null){
            fiesta = new Fiesta();
        }
        
        return fiesta;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Media";
        this.nombre="Ford fiesta";
        this.cantidad=escogerCantidad();
        this.precio="47 millones de pesos";
        this.color=escogerColor();
    }
    
}
