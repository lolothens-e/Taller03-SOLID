/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OpenClose.Violacion;

/**
 *
 * @author CltControl
 */
public class Pelicula {
    private String fechaEstreno;
    private TipoEstreno tipo;
    private double precioTicket;
    
    Pelicula(String estreno, TipoEstreno tipoPelicula){
        fechaEstreno= estreno;
        tipo = tipoPelicula;
        precioTicket = obtenerPrecioPelicula(tipoPelicula);
    }
    public double obtenerPrecioPelicula(TipoEstreno tipoPelicula){
        switch(tipoPelicula){
            case Taquillera -> {
                return 8.00;
            }
            case Casual -> {
                return 4.50;
            }
            case Indie -> {
                return 4.00;
            }
            case Reestreno -> {
                return 6.00;
            }       
        }
        return 0;
    }
}
