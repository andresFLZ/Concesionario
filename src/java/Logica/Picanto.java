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
public class Picanto extends Auto{
    
    static private Picanto picanto = null; 
    
    private Picanto(){}
    
    //Singleton
    public static Picanto getInstance(){
        if(picanto == null){
            picanto = new Picanto();
        }
        
        return picanto;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Media";
        this.nombre="Kia picanto";
        this.cantidad=escogerCantidad();
        this.precio="40 millones de pesos";
        this.color=escogerColor();
    }
    
}
