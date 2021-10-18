/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Gerente extends Empleado{
    //atributo
    private String departamento;
    //constructor
    public Gerente(String departamento, double sueldo, String nombre) {
        super(sueldo, nombre);
        this.departamento = departamento;
    }
    //get and set

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    //metodo mostrarDetalles
    public String mostrarDetalles(){
        return super.mostrarDetalles() + " -Gerente: "+this.departamento;
        
    }
    
    
}
