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
public class R8 extends Auto{
    
    static private R8 r8 = null; 
    
    private R8(){}
    
    //Singleton
    public static R8 getInstance(){
        if(r8 == null){
            r8 = new R8();
        }
        
        return r8;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Alta";
        this.nombre="Audi R8";
        this.cantidad=escogerCantidad();
        this.precio="700 millones de pesos";
        this.color=escogerColor();
    }
    
}
