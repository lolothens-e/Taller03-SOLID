/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependencyInversion.Solucion;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Funcion implements Pelicula{
    private String fecha;
    private String nombrePelicula;
    private float duracion;
    private boolean funcionEspecial;

    public Funcion(String fecha, String pelicula, float duracion, boolean funcionEspecial) {
        this.fecha = fecha;
        this.nombrePelicula = pelicula;
        this.duracion = duracion;
        this.funcionEspecial=funcionEspecial;
    }
    
    public void proyectarPelicula(){
        fecha="fecha actual";
        while(duracion >  0){
            transmision();
            duracion--;
        }
        terminarFuncion();
    }
    
    public void terminarFuncion(){
        System.out.println("Gracias por asistir!");
        if (funcionEspecial) System.out.println("Recoger recompensas al salir!");
    }

    @Override
    public void transmision() {
        System.out.println("Disfrute su pelicula");
    }
}
