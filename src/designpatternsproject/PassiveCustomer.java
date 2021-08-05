/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsproject;

/**
 *
 * @author rog91
 */
public class PassiveCustomer extends Customer implements Observer {

    public PassiveCustomer() {
        shoppingBehavior = new ShoppingOnline();
    }

    @Override
    public void update(String message) {
        System.out.println("Customer: Passive customer made note of the sale.");
    }
    
    
}
