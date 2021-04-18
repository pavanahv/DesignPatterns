/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.ObserverPattern;

/**
 *
 * @author alla.kumarreddy
 */
public class Driver {
    
    public static void main(String args[]){
        ConcreteObserveable concreteObserveable = new ConcreteObserveable();
        IObserver iObservera = new ConcreteObserverA(concreteObserveable);
        IObserver iObserverb = new ConcreteObserverB(concreteObserveable);
        concreteObserveable.add(iObservera);
        concreteObserveable.add(iObserverb);
        concreteObserveable.nootify();
        concreteObserveable.remove(iObservera);
        concreteObserveable.remove(iObserverb);
    }
    
}
