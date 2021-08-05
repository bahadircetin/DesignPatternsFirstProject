/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rog91
 */
public class Store implements Subject{
    private List<Observer> customers =new ArrayList<>();

    @Override
    public void addSubscriber(Observer customer) {
      customers.add(customer);
    }

    @Override
    public void removeSubscriber(Observer customer) {
       customers.remove(customer);
    }

    @Override
    public void notifySubscribers() {
        System.out.println("Store: A new item is on sale! Act fast before it sells out!");
        for(Observer customer: customers){
            customer.update("Sale!");
        }
    }
    
    
}
