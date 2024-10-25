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
public class SalaVIP extends SalaCine {
    public SalaVIP(int nAsientos, ArrayList<String> snacksIncluidos, String colorSala) {
        super(nAsientos, snacksIncluidos, colorSala);
    }
    
}
