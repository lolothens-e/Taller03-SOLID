/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

public class Product {
    private String name;
    private double price;
    protected double iva;
    
    public Product(String name, double price){
        //constructor
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getIva(){
        return iva;
    }
}
