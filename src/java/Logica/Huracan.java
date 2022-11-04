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
public class Huracan extends Auto{
    
    static private Huracan huracan = null; 
    
    private Huracan(){}
    
    //Singleton
    public static Huracan getInstance(){
        if(huracan == null){
            huracan = new Huracan();
        }
        
        return huracan;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Alta";
        this.nombre="Lamborghini huracán";
        this.cantidad=escogerCantidad();
        this.precio="961 millones de pesos";
        this.color=escogerColor();
    }
    
}
