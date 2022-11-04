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
public class Mini extends Auto{
    
    static private Mini mini = null; 
    
    private Mini(){}
    
    //Singleton
    public static Mini getInstance(){
        if(mini == null){
            mini = new Mini();
        }
        
        return mini;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Media";
        this.nombre="Mini cooper";
        this.cantidad=escogerCantidad();
        this.precio="85 millones de pesos";
        this.color=escogerColor();
    }
    
}
