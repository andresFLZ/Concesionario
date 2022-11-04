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
public class R9 extends Auto{
    
    static private R9 r9 = null; 
    
    private R9(){}
    
    //Singleton
    public static R9 getInstance(){
        if(r9 == null){
            r9 = new R9();
        }
        
        return r9;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Baja";
        this.nombre="Renault r9";
        this.cantidad=escogerCantidad();
        this.precio="7 millones de pesos";
        this.color=escogerColor();
    }
    
}
