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
public abstract class Component {
    
    String getDesciption(){
        return "Default Desciption";
    }
    
    abstract int calculateCost();
}
