/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno Mañana
 */
public enum TipoEscritura {
    //lista numerada
   CLASICO("Escritura a mano"),
   MODERNO("Escritura digital");
   //atributo
   private final String descripcion;
   //constructor
   private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
   //get
    public String getDescripcion() {
        return this.descripcion;
    }

    
    
   
    
    
}
