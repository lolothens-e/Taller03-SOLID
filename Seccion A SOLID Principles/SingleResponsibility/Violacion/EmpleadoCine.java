/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleResponsibility.Violacion;

/**
 *
 * @author CltControl
 */
public class EmpleadoCine {
    private String idEmpleado;
    private String nombre;
    private int edad;
    private double valorEnCaja;
    
    EmpleadoCine(String ID,String Nombre,int Edad){
        idEmpleado=ID;
        nombre=Nombre;
        edad=Edad;
        valorEnCaja=0;
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
    public void cobrarTickets(){
        valorEnCaja+=5.00;
    }
    public void devolucion(){
        if (valorEnCaja>0) valorEnCaja+=5.00;
    }
}
