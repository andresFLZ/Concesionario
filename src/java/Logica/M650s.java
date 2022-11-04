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
public class M650s extends Auto{
    
    static private M650s m650s = null; 
    
    private M650s(){}
    
    //Singleton
    public static M650s getInstance(){
        if(m650s == null){
            m650s = new M650s();
        }
        
        return m650s;
    }
    
    @Override
    public void asignarDatosAuto(){
        this.gama="Alta";
        this.nombre="Mclaren 650s";
        this.cantidad=escogerCantidad();
        this.precio="540 millones de pesos";
        this.color=escogerColor();
    }
    
}
