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
public class SalaVIP extends SalaPremium {
    
    public SalaVIP(int nAsientos, ArrayList<String> snacksIncluidos, String colorSala) {
        super(nAsientos, snacksIncluidos, colorSala);
    }
    
}
