/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class Compra {
    private Payment payment;
    private List<Articulo> articulos = new ArrayList<>();

    public Compra(Payment payment) {
        this.payment = payment;
    }

    public void agregarArticulo(Articulo articulo) {
        // Agregar artículo a la compra
    }

    public void removerArticulo(Articulo articulo) {
        // Remover artículo de la compra
    }

    public void realizarPago() {
        payment.realizarCobro(100); // Monto de ejemplo
    }
}
