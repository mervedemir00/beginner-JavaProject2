/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.staticdemo;

/**
 *
 * @author merve
 */
public class ProductValidator {
    
    public boolean isValid(Product product){
        
        if(product.price >0 && !product.name.isEmpty()){
            return true;
    }else{
    return false;
}
}
}