/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSubstitution.Solucion;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class SalaCine {
    int nAsientos;
    ArrayList<String> snacksIncluidos;
    String colorSala;

    public SalaCine(int nAsientos, ArrayList<String> snacksIncluidos, String colorSala) {
        this.nAsientos = nAsientos;
        this.snacksIncluidos = snacksIncluidos;
        this.colorSala = colorSala;
    }
    
    public void increaseCapacity(int asientosAdicionados){
        this.nAsientos+=asientosAdicionados;
    }
}
