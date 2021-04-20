/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.CommandPattern;

/**
 *
 * @author alla.kumarreddy
 */
public class Driver {

    public static void main(String args[]){
        Invoker invoker = new Invoker();
        
        // Add as many commands like below with receiver attached to it
        Receiver receiver = new Receiver();
        ICommand command = new Command(receiver);
        invoker.add(command);
        
        invoker.invoke();
    }
}
