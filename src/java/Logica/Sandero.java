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
public class Sandero extends Auto{
    
    static private Sandero sandero = null; 
    
    private Sandero(){}
    
    //Singleton
    public static Sandero getInstance(){
        if(sandero == null){
            sandero = new Sandero();
        }
        
        return sandero;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Media";
        this.nombre="Renault sandero";
        this.cantidad=escogerCantidad();
        this.precio="45 millones de pesos";
        this.color=escogerColor();
    }
    
}
