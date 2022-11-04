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
public class Corsa extends Auto{
    
    static private Corsa corsa = null; 
    
    private Corsa(){}
    
    //Singleton
    public static Corsa getInstance(){
        if(corsa == null){
            corsa = new Corsa();
        }
        
        return corsa;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Baja";
        this.nombre="Chevrolet corsa";
        this.cantidad=escogerCantidad();
        this.precio="12 millones de pesos";
        this.color=escogerColor();
    }
    
}
