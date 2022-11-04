/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Logica.Auto;
import Logica.Huracan;
import Logica.LaFerrari;
import Logica.M650s;
import Logica.R8;
import Logica.Skyline;

/**
 *
 * @author lenovo
 */
public class GamaAltaFactory implements AbstractFactory{
    
    @Override
    public Auto crearAuto1(){
        return LaFerrari.getInstance();
    }
    @Override
    
    public Auto crearAuto2(){
        return Huracan.getInstance();
    }
    @Override
    public Auto crearAuto3(){
        return R8.getInstance();
    }
    @Override
    public Auto crearAuto4(){
        return M650s.getInstance();
    }
    @Override
    public Auto crearAuto5(){
        return Skyline.getInstance();
    }
    
}
