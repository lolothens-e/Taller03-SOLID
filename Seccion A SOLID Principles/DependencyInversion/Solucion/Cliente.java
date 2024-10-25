/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependencyInversion.Solucion;

import DependencyInversion.Violacion.*;
import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Cliente implements Pelicula {
    private String nombre;
    private int puntosLealtad;

    public Cliente(String nombre) {
        this.nombre=nombre;
        this.puntosLealtad=0;
    }
    
    public void observarPelicula(){
        transmision();
    }

    @Override
    public void transmision() {
        puntosLealtad++;
    }
    
}
