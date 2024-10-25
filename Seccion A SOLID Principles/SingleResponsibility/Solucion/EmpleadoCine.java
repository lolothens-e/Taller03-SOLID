/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleResponsibility.Solucion;

/**
 *
 * @author CltControl
 */
public class EmpleadoCine {
    private String idEmpleado;
    private String nombre;
    private int edad;
    
    EmpleadoCine(String ID,String Nombre,int Edad){
        idEmpleado=ID;
        nombre=Nombre;
        edad=Edad;
    }
    
    public void cumplirAnyos(){ 
        edad++;
    }
    public void cambiarNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
    public void despido(){
        // Some sort of operation where ID is deleted from database.
    }
    
}
