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
public class ConcreteProductFactoryB implements ProductFactory{

    @Override
    public Product createProduct() {
        // create object based on some logic 
        return new ConcreteProductA();
    }
    
}
