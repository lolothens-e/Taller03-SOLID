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
public class SalaPremium extends SalaCine {
    
    public SalaPremium(int nAsientos, ArrayList<String> snacksIncluidos, String colorSala) {
        super(nAsientos, snacksIncluidos, colorSala);
    }
    
    public void agregarSnack(String snack){
        this.snacksIncluidos.add(snack);
    }
    
    
}
