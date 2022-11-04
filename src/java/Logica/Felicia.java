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
public class Felicia extends Auto{
    
    static private Felicia felicia = null; 
    
    private Felicia(){}
    
    //Singleton
    public static Felicia getInstance(){
        if(felicia == null){
            felicia = new Felicia();
        }
        
        return felicia;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Baja";
        this.nombre="Skoda felicia";
        this.cantidad=escogerCantidad();
        this.precio="8 millones de pesos";
        this.color=escogerColor();
    }
    
}
