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
public interface IObserveable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void nootify();
}
