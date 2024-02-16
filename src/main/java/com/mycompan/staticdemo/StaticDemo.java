/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompan.staticdemo;

public class StaticDemo {

    public static void main(String[] args) {
        
        
        ProductManager manager = new ProductManager();
        
        Product product= new Product();
        
        product.id=1569;
        product.name="Mercedes";
        product.price=147.65;
        
        manager.add(product);
    }
}
