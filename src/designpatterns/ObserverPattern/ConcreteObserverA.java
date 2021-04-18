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
public class ConcreteObserverA implements IObserver{

    private ConcreteObserveable observable;
    public ConcreteObserverA(ConcreteObserveable observable) {
        this.observable = observable;
    }

    
    @Override
    public void update() {
        System.out.println("ConcreteObserverA : "+this.observable.getData());
    }
    
}
