package designpatternsproject;

public abstract class Customer {
    ShoppingBehavior shoppingBehavior;

    public void performShopping(){
        shoppingBehavior.shop();
    }

    public void setShoppingBehavior(ShoppingBehavior sb){
        shoppingBehavior = sb;
    }

}
