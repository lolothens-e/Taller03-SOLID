/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceSegregation.Violacion;

/**
 *
 * @author Anthony
 */
public class EmpleadoBar extends Empleado implements EmpleadoCine{

    @Override
    public void cerrarLocal() {
        //Cerrando Local
    }

    @Override
    public void abrirLocal() {
        //Local abierto@
    }

    @Override
    public void generarReporteFinanciero() {
        // Nada que hacer
    }

    @Override
    public void cuadrarCaja() {
        // Contando dinero...
    }

    @Override
    public void devolucionTicket() {
        // Nada que hacer
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
