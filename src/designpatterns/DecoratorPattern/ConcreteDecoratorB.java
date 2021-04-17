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
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    
    @Override
    int calculateCost() {
        return this.component.calculateCost() + 2;
    }
    
}
