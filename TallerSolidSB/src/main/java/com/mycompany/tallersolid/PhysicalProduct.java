/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

public class PhysicalProduct extends Product{
    private double weight;
    
    public PhysicalProduct(String name, double price, double weight){
        super(name, price);
        this.weight=weight;
        iva=0.12;
    }
    
    public double getWeight(){
        return weight;
    }
}
