/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Factory.AbstractFactory;
import Factory.GamaBajaFactory;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class GamaBaja {
    
    private final AbstractFactory factory = new GamaBajaFactory();
    ArrayList <Auto> autosGamaBaja = new ArrayList<>();
    static private GamaBaja gamaBaja = null; 
    
    private GamaBaja(){}
    
    //Singleton
    public static GamaBaja getInstance(){
        if(gamaBaja == null){
            gamaBaja = new GamaBaja();
        }
        
        return gamaBaja;
    }
    
    public ArrayList<Auto> generarAutosGB(){
        
        Felicia felicia = (Felicia) factory.crearAuto1();
        Escarabajo escarabajo = (Escarabajo) factory.crearAuto2();
        R9 r9 = (R9) factory.crearAuto3();
        Sentra sentra = (Sentra) factory.crearAuto4();
        Corsa corsa = (Corsa) factory.crearAuto5();
        
        autosGamaBaja.add(felicia);
        autosGamaBaja.add(escarabajo);
        autosGamaBaja.add(r9);
        autosGamaBaja.add(sentra);
        autosGamaBaja.add(corsa);
        
        return autosGamaBaja;
    }
    
}
