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
public class Invoker {
    
    ICommand command;
    public void add(ICommand command){
        this.command = command;
    }
    
    public void invoke(){
        this.command.execute();
    }
}
