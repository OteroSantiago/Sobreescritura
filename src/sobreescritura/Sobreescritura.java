/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobreescritura;
import com.ceep.dominio.*;
/**
 *
 * @author Alumno Mañana
 */
public class Sobreescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(2000.00,"Paco");
        //System.out.println(e1.mostrarDetalles());
        determinarTipo(e1);
        imprimir(e1);
        
        
        Empleado e2;
        e2 = new Escritor("Cervantes",55000,TipoEscritura.CLASICO);
        System.out.println(e2.mostrarDetalles());
        ((Escritor)e2).getTipoEscritura().getDescripcion();
        
        //downcasting
        Escritor escritor = (Escritor) e2;
        escritor.getTipoEscritura();
        //upcasting
        Empleado e3 = escritor;
        
        Gerente g1 = new Gerente("RRHH",2500, " Luis");
        //System.out.println(g1.mostrarDetalles());
        determinarTipo(g1);
        imprimir(g1);//nos dejara imprimir porque gerente es una clase hija de empleado y por ende un gerente es un empleado
    
    }
    
    
    public static void imprimir(Empleado emp){//Le metemos un objeto de tipo empleado
        System.out.println("-Empleado: "+emp.mostrarDetalles());
    }
    public static void determinarTipo(Empleado emp){
        if(emp instanceof Gerente){
            System.out.println("Empleado es de tipo Gerente");
            System.out.println(((Gerente) emp).getDepartamento());//emp si pongo emp.. me hace un downcasting automatico
        }
        else if(emp instanceof Empleado){
            System.out.println("Empleado es de tipo Empleado");
        }
        else if(emp instanceof Object){
            System.out.println("Empleado es de tipo Object");
        }
        //si lo tuvieramos con if  nos diria dos lineas de esta estructura
    }
        
    }
    

