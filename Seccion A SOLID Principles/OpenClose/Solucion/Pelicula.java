/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OpenClose.Solucion;

import OpenClose.Violacion.TipoEstreno;

/**
 *
 * @author Anthony
 */
public class Pelicula {
    private String fechaEstreno;
    private TipoEstrenoInterface tipo;
    private double precioTicket;
    
    Pelicula(String estreno, TipoEstrenoInterface tipoPelicula){
        fechaEstreno= estreno;
        tipo = tipoPelicula;
        precioTicket = obtenerPrecioTicket(this.tipo);
    }
    private double obtenerPrecioTicket(TipoEstrenoInterface tipoPelicula){
        return tipoPelicula.getPrecioTicket();
    }
}
