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
public class Sentra extends Auto{
    
    static private Sentra sentra = null; 
    
    private Sentra(){}
    
    //Singleton
    public static Sentra getInstance(){
        if(sentra == null){
            sentra = new Sentra();
        }
        
        return sentra;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Baja";
        this.nombre="Nissan sentra 1.6";
        this.cantidad=escogerCantidad();
        this.precio="13 millones de pesos";
        this.color=escogerColor();
    }
    
}
