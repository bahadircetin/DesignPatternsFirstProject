/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsproject;


import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.Scanner;

/**
 *
 * @author rog91
 */
public class ShoppingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Creating Store as our Subject
        Scanner sc = new Scanner(System.in);
        Subject fashionChainStores = new Store();

        //Initializing our Customers
        ShopaholicCustomer customer1 = new ShopaholicCustomer();
        PassiveCustomer customer2 = new PassiveCustomer();
        ShopaholicCustomer customer3 = new ShopaholicCustomer();

        //Different kind of customers have different ShoppingBehaviors
        customer1.performShopping();
        customer2.performShopping();
        customer3.performShopping();

        // Creating observers which are different kind of customers
        Observer observer1 = customer1;
        Observer observer2 = customer2;
        Observer observer3 = customer3;

        // Adding subscribers to our Fashion Store
        fashionChainStores.addSubscriber(observer1);
        fashionChainStores.addSubscriber(observer2);
        fashionChainStores.addSubscriber(observer3);

        // There is a sale in the Store we need to notify our subscribers
        System.out.println("Please enter 'Sale' to notify your customers about discount in the Store: \n");
        String sale = sc.next();
        if("sale".equalsIgnoreCase(sale)) {
            System.out.println("\n\nStore: A sale in the Store notifying customers..");
            fashionChainStores.notifySubscribers();
        }
        // Remove the customer from the subscriber list
        fashionChainStores.removeSubscriber(observer1);

        // There is a new sale in the our Fashion Store we need to notify our subscribers.
        System.out.println("Please enter 'Newsale' to notify your customers about new discount in the Store: \n");
        sale = sc.next();
        if("newsale".equalsIgnoreCase(sale)) {
            System.out.println("\n\nStore: There is new sale in store notifying customers..");
            fashionChainStores.notifySubscribers();
        }



        // We can change customer's ShoppingBehavior in the run-time.
        // We will set to ShoppingOnline which was ShoppingPhysical as default.
        customer3.setShoppingBehavior(new ShoppingOnline());

        // We can see the behavior has changed now.
        customer3.performShopping();
        
    }
    
}
