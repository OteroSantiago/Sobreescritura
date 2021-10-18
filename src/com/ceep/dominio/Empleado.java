/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado {
    //atributos protegidos
    protected double sueldo;
    protected String nombre;
    //constructor
    public Empleado(double sueldo, String nombre) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }
    //getters and setters
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodo
    public String mostrarDetalles(){
        return "Gerente: "+this.sueldo+","+this.nombre;
        
        
    }
    
    
}
