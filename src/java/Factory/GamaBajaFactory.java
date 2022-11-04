/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Logica.Auto;
import Logica.Corsa;
import Logica.Escarabajo;
import Logica.Felicia;
import Logica.R9;
import Logica.Sentra;

/**
 *
 * @author lenovo
 */
public class GamaBajaFactory implements AbstractFactory{
    
    @Override
    public Auto crearAuto1(){
        return Felicia.getInstance();
    }
    @Override
    
    public Auto crearAuto2(){
        return Escarabajo.getInstance();
    }
    @Override
    public Auto crearAuto3(){
        return R9.getInstance();
    }
    @Override
    public Auto crearAuto4(){
        return Sentra.getInstance();
    }
    @Override
    public Auto crearAuto5(){
        return Corsa.getInstance();
    }
    
}
