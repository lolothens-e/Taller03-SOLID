/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

/**
 *
 * @author Steven
 */
public class IvaCalculator {
    public double calculateIVA(Product p){
        double iva= p.getPrice() * p.getIva();
        return iva;
    }
}
