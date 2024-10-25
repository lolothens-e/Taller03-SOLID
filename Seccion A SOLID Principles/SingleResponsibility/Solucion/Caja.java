/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleResponsibility.Solucion;

/**
 *
 * @author CltControl
 */
public class Caja {
    private EmpleadoCine empleadoTurno;
    private double valorEnCaja;
    
    public void asignarEmpleado(){
        empleadoTurno=new EmpleadoCine("ID", "Nombre",20);
    }
    public void cobrarTickets(){
        valorEnCaja+=5.00;
    }
    public void devolucion(){
        if (valorEnCaja>0) valorEnCaja+=5.00;
    }
    
}
