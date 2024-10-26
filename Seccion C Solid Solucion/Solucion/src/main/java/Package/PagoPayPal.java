/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class PagoPayPal implements Payment {
    private boolean loggedIn;

    public PagoPayPal(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    @Override
    public void realizarCobro(double monto) {
        if (!loggedIn) return;
        // Lógica de cobro específica de PayPal
    }

    @Override
    public void calcularImpuestosFactura() {
        // Lógica de impuestos específica de PayPal
    }

    @Override
    public void generarFactura() {
        // Lógica de factura específica de PayPal
    }
}

