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
public class LaFerrari extends Auto{
    
    static private LaFerrari laFerrari = null; 
    
    private LaFerrari(){}
    
    //Singleton
    public static LaFerrari getInstance(){
        if(laFerrari == null){
            laFerrari = new LaFerrari();
        }
        
        return laFerrari;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Alta";
        this.nombre="Ferrari la ferrari";
        this.cantidad=escogerCantidad();
        this.precio="13.700 millones de pesos";
        this.color=escogerColor();
    }
    
}
