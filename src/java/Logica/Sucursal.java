/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author lenovo
 */
public class Sucursal {
    
    // atributos
    private String nombre;
    private int autosDisponibles;
    private final ArrayList <Auto> autos = new ArrayList<>();
    static private Sucursal sucursal = null;
    
    private Sucursal(){}
    
    // setters & getters

    public int getAutosDisponibles() {
        return autosDisponibles;
    }

    public void setAutosDisponibles(int autosDisponibles) {
        this.autosDisponibles = autosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    // Metodos

    private ArrayList<Auto> generarAutos(){
        GamaAlta gamaA = GamaAlta.getInstance();
        GamaMedia gamaM = GamaMedia.getInstance();
        GamaBaja gamaB = GamaBaja.getInstance();
        
        ArrayList <Auto> autosGamaA = gamaA.generarAutosGA();
        ArrayList <Auto> autosGamaM = gamaM.generarAutosGM();
        ArrayList <Auto> autosGamaB = gamaB.generarAutosGB();
        
        for(int i=0;i<5;i++){
            autos.add(autosGamaA.get(i)); //autos 0-4
        }
        for(int i=0;i<5;i++){
            autos.add(autosGamaM.get(i)); //autos 5-9
        }
        for(int i=0;i<5;i++){
            autos.add(autosGamaB.get(i)); //autos 10-14
        }
        
        return autos;
    }
    
    public ArrayList<Auto> generarAutosDisponibles(int autosDisponibles){
        ArrayList <Auto> autosD = new ArrayList();
        ArrayList <Auto> auto = generarAutos();
        this.autosDisponibles=autosDisponibles;
        int aux = autosDisponibles;
        int max = 15;
        
        while(aux !=0){
            int i = ThreadLocalRandom.current().nextInt(0, max);
            autosD.add(auto.get(i));
            auto.remove(i);
            aux--;
            max--;
        }
        
        for(int i=0;i<autosDisponibles;i++){
            autosD.get(i).asignarDatosAuto();
        }
       
        return autosD;
    }
    
    //Singleton
    public static Sucursal getInstance(){
        if(sucursal == null){
            sucursal = new Sucursal();
        }
        
        return sucursal;
    }
    
}
