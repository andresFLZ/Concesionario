/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Factory.AbstractFactory;
import Factory.GamaMediaFactory;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class GamaMedia {
    
    private final AbstractFactory factory = new GamaMediaFactory();
    ArrayList <Auto> autosGamaMedia = new ArrayList<>();
    static private GamaMedia gamaMedia = null; 
    
    private GamaMedia(){}
    
    //Singleton
    public static GamaMedia getInstance(){
        if(gamaMedia == null){
            gamaMedia = new GamaMedia();
        }
        
        return gamaMedia;
    }
    
    public ArrayList<Auto> generarAutosGM(){
        
        Sandero sandero = (Sandero) factory.crearAuto1();
        Mini mini = (Mini) factory.crearAuto2();
        Mazda2 mazda2 = (Mazda2) factory.crearAuto3();
        Picanto picanto = (Picanto) factory.crearAuto4();
        Fiesta fiesta = (Fiesta) factory.crearAuto5();
        
        autosGamaMedia.add(sandero);
        autosGamaMedia.add(mini);
        autosGamaMedia.add(mazda2);
        autosGamaMedia.add(picanto);
        autosGamaMedia.add(fiesta);
        
        return autosGamaMedia;
    }
    
}
