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
public class Escarabajo extends Auto{
    
    static private Escarabajo escarabajo = null; 
    
    private Escarabajo(){}
    
    //Singleton
    public static Escarabajo getInstance(){
        if(escarabajo == null){
            escarabajo = new Escarabajo();
        }
        
        return escarabajo;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Baja";
        this.nombre="Volkswagen escarabajo";
        this.cantidad=escogerCantidad();
        this.precio="15 millones de pesos";
        this.color=escogerColor();
    }
    
}
