/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.DecoratorPattern;

/**
 *
 * @author alla.kumarreddy
 */
public class Driver {
    
    public static void main(String args[]){
        ConcreteComponentA concreteComponentA = new ConcreteComponentA();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(concreteComponentA);
        System.out.println(concreteDecoratorA.calculateCost());
        
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
        System.out.println(concreteDecoratorB.calculateCost());
    }
}
