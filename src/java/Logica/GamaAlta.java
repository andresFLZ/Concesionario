/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Factory.AbstractFactory;
import Factory.GamaAltaFactory;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class GamaAlta {
    
    private final AbstractFactory factory = new GamaAltaFactory();
    /*private final LaFerrari ferrari;
    private final Huracan huracan;
    private final R8 r8;
    private final M650s m650s;
    private final Skyline skyline;*/
    private final ArrayList <Auto> autosgamaAlta = new ArrayList<>();
    
    /*GamaAlta(AbstractFactory factory){
        ferrari = (LaFerrari) factory.crearAuto1();
        huracan = (Huracan) factory.crearAuto2();
        r8 = (R8) factory.crearAuto2();
        m650s = (M650s) factory.crearAuto2();
        skyline = (Skyline) factory.crearAuto2();
    }*/
    
    static private GamaAlta gamaAlta = null; 
    
    private GamaAlta(){}
    
    //Singleton
    public static GamaAlta getInstance(){
        if(gamaAlta == null){
            gamaAlta = new GamaAlta();
        }
        
        return gamaAlta;
    }
    
    public ArrayList<Auto> generarAutosGA(){
        LaFerrari ferrari = (LaFerrari) factory.crearAuto1();
        Huracan huracan = (Huracan) factory.crearAuto2();
        R8 r8 = (R8) factory.crearAuto3();
        M650s m650s = (M650s) factory.crearAuto4();
        Skyline skyline = (Skyline) factory.crearAuto5();
        
        /*LaFerrari ferrari = LaFerrari.getInstance();
        Huracan huracan = Huracan.getInstance();
        R8 r8 = R8.getInstance();
        M650s m650s = M650s.getInstance();
        Skyline skyline = Skyline.getInstance();*/
        
        autosgamaAlta.add(ferrari);
        autosgamaAlta.add(huracan);
        autosgamaAlta.add(r8);
        autosgamaAlta.add(m650s);
        autosgamaAlta.add(skyline);
        
        return autosgamaAlta;
    }
}
