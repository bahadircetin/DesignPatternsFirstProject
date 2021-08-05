package designpatternsproject;

public class ShoppingPhysical implements ShoppingBehavior{
    @Override
    public void shop() {
        System.out.println("I need to try on everything before I buy. I don't care about COVID-19 ");
    }
}
