/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Escritor extends Empleado {
    //Atributo
    final TipoEscritura tipoEscritura;
    //Constructor
    public Escritor(String nombre, double sueldo,TipoEscritura tipoEscritura){
        super(sueldo, nombre);
        this.tipoEscritura = tipoEscritura;
    }
    //metodo
    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles()+", Escritorio: "+this.tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
   
    
}
