/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceSegregation.Violacion;

/**
 *
 * @author Anthony
 */
public class Ticketero extends Empleado implements EmpleadoCine{

    @Override
    public void cerrarLocal() {
        // Nada que hacer
    }

    @Override
    public void abrirLocal() {
        // Nada que hacer
    }

    @Override
    public void generarReporteFinanciero() {
        // Nada que hacer
    }

    @Override
    public void cuadrarCaja() {
        // Todo cuadra!
    }

    @Override
    public void devolucionTicket() {
        //Ticket ha sido devuelto
    }

    @Override
    public void seleccionarTopEmpleado() {
        // Nada que hacer
    }

    @Override
    public void despedirEmpleado() {
        // Nada que hacer
    }

    @Override
    public void recibirSueldo() {
        // Ka-ching!
    }

    @Override
    public void calcularLiquidacion() {
        // Gracias por sus servicios.
    }
    
}
