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
public class Mazda2 extends Auto{
    
    static private Mazda2 mazda2 = null; 
    
    private Mazda2(){}
    
    //Singleton
    public static Mazda2 getInstance(){
        if(mazda2 == null){
            mazda2 = new Mazda2();
        }
        
        return mazda2;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Media";
        this.nombre="Mazda 2";
        this.cantidad=escogerCantidad();
        this.precio="68 millones de pesos";
        this.color=escogerColor();
    }
    
}
