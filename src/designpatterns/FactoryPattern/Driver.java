/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.FactoryPattern;

/**
 *
 * @author alla.kumarreddy
 */
public class Driver {
    
    public static void main(String args[]){
        ConcreteProductFactoryA concreteProductFactoryA = new ConcreteProductFactoryA();
        ConcreteProductFactoryB concreteProductFactoryB = new ConcreteProductFactoryB();
        Product product = concreteProductFactoryA.createProduct();
        product.description();
        product = concreteProductFactoryB.createProduct();
        product.description();
    }
    
}
