/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSubstitution.Violacion;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Sala3D extends SalaCine {
    
    public Sala3D(int nAsientos, ArrayList<String> snacksIncluidos, String colorSala) {
        super(nAsientos, snacksIncluidos, colorSala);
    }
    
    @Override 
    public void agregarSnack(String snack){
        throw new UnsupportedOperationException("Las salas regulares no incluyen snacks ");
    }
}
