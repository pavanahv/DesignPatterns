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
public class Command implements ICommand{

    Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
    
    
    @Override
    public void execute() {
        this.receiver.action();
    }

    @Override
    public void unExecute() {
        
    }
    
}
