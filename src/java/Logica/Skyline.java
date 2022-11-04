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
public class Skyline extends Auto{
    
    static private Skyline skyline = null; 
    
    private Skyline(){}
    
    //Singleton
    public static Skyline getInstance(){
        if(skyline == null){
            skyline = new Skyline();
        }
        
        return skyline;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Alta";
        this.nombre="Nissan skyline";
        this.cantidad=escogerCantidad();
        this.precio="340 millones de pesos";
        this.color=escogerColor();
    }
    
}
