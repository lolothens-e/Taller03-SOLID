/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceSegregation.Violacion;

/**
 *
 * @author Anthony
 */
public class EmpleadoAdministrativo extends Empleado implements EmpleadoCine{
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
        //Implementacion de reporte Financiero
    }
    @Override
    public void cuadrarCaja() {
        // Nada que hacer
    }
    @Override
    public void devolucionTicket() {
        // Nada que hacer
    }
    @Override
    public void seleccionarTopEmpleado() {
        //Seleccionando...
    }
    @Override
    public void despedirEmpleado() {
        //Empleado XYZ ha sido despedido.
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
