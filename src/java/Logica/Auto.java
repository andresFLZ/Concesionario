/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Auto {
    
    // atributos
    
    public String gama;
    public String nombre;
    public String cantidad;
    public String precio;
    public String color;
    
    // setters & getters

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    protected String escogerCantidad(){
        ArrayList cantidadAuto = new ArrayList();
        cantidadAuto.add("1");
        cantidadAuto.add("2");
        cantidadAuto.add("3");
        cantidadAuto.add("4");
        cantidadAuto.add("5");
        int i = (int) Math.floor(Math.random()*5);
        return (String) cantidadAuto.get(i);
    }
    
    protected String escogerColor(){
        ArrayList colorAuto = new ArrayList();
        colorAuto.add("Verde");
        colorAuto.add("Rojo");
        colorAuto.add("Azul");
        colorAuto.add("Negro");
        colorAuto.add("Blanco");
        colorAuto.add("Amarillo");
        colorAuto.add("Naranja");
        colorAuto.add("Gris");
        int i = (int) Math.floor(Math.random()*8);
        return (String) colorAuto.get(i);
    }
    
    public void asignarDatosAuto(){}
}
