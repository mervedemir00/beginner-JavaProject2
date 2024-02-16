/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.staticdemo;

/**
 *
 * @author merve
 */
public class ProductManager {
    
    
    public void add(Product product){
        
        ProductValidator validator = new ProductValidator();
        
        if(validator.isValid(product)){
            System.out.println("ADDED");
        }else{
            System.out.println("COULD NOT BE ADDED  ");
        }
    }
}
