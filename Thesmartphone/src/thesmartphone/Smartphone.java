/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesmartphone;

/**
 *
 * @author Flora
 */
public class Smartphone {
    
    String brand_name,battery_capacity,weight;
    
    Smartphone()
    {
        brand_name = "Samsung";
        battery_capacity = "5000mah";
        weight = "180g";
    }
    Smartphone(String brand_name,String battery_capacity,String weight)
    {
        this.brand_name = brand_name;
        this.battery_capacity=battery_capacity;
        this.weight= weight;       
    }
    
}
