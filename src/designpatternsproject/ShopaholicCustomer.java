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
public class ShopaholicCustomer extends Customer implements Observer {
    public ShopaholicCustomer() {
        shoppingBehavior = new ShoppingPhysical();
    }

    @Override
    public void update(String message) {
        processMessage(message);
    }
private void processMessage(String message){
    System.out.println("Customer: Shopaholic customer is interested in buying the product on sale!");
}
    
}
