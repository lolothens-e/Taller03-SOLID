/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author Dario Anchundia Cobo
 */
public interface Payment {
    void realizarCobro(double monto);
    void calcularImpuestosFactura();
    void generarFactura();
}