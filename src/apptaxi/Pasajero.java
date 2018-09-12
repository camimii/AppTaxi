/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptaxi;

/**
 *
 * @author Camila
 */
public class Pasajero {
    protected String rut;
    protected String nombre;
    protected String paradaBajada;
    
    
    public Pasajero(String rut, String nombre, String paradaBajada) {
        this.rut = "18540362-9";
        this.nombre = "Camila";
        this.paradaBajada = "Pajaritos 100";
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParadaBajada() {
        return paradaBajada;
    }

    public void setParadaBajada(String paradaBajada) {
        this.paradaBajada = paradaBajada;
    }
    

}

