/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependencyInversion.Violacion;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Funcion {
    private String fecha;
    private String pelicula;
    private float duracion;
    private boolean funcionEspecial;
    private ArrayList<Cliente> asistentes;

    public Funcion(String fecha, String pelicula, float duracion, boolean funcionEspecial) {
        this.fecha = fecha;
        this.pelicula = pelicula;
        this.duracion = duracion;
        this.funcionEspecial=funcionEspecial;
    }
    
    public void proyectarPelicula(){
        fecha="fecha actual";
        while(duracion >  0){
            duracion--;
            for(Cliente c: asistentes) c.observarPelicula();
        }
        terminarFuncion();
    }
    
    public void terminarFuncion(){
        System.out.println("Gracias por asistir!");
    }
    
}
