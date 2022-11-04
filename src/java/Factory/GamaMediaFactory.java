/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Logica.Auto;
import Logica.Fiesta;
import Logica.Mazda2;
import Logica.Mini;
import Logica.Picanto;
import Logica.Sandero;

/**
 *
 * @author lenovo
 */
public class GamaMediaFactory implements AbstractFactory{
    
    @Override
    public Auto crearAuto1(){
        return Sandero.getInstance();
    }
    @Override
    
    public Auto crearAuto2(){
        return Mini.getInstance();
    }
    @Override
    public Auto crearAuto3(){
        return Mazda2.getInstance();
    }
    @Override
    public Auto crearAuto4(){
        return Picanto.getInstance();
    }
    @Override
    public Auto crearAuto5(){
        return Fiesta.getInstance();
    }
    
}
