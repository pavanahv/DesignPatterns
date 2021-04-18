/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alla.kumarreddy
 */
public class ConcreteObserveable implements IObserveable{

    List<IObserver> observers = new ArrayList<IObserver>();
    private int data;
    
    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void nootify() {
        for(IObserver observer : observers){
            observer.update();
        }
    }
    
    public int getData(){
        return this.data;
    }
}
