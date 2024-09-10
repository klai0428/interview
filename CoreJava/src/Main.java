import supermarket.Fruit;
import supermarket.Apple;
import supermarket.Mango;
import supermarket.Strawberry;
import supermarket.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        //顾客 A
        System.out.println("Customer A Shopping Cart Checkout... \t");
        ShoppingCart cart1 = new ShoppingCart();
        Fruit apple1 = new Apple("Golden Apple", 2, 8, 1.0);
        Fruit strawberry1 = new Strawberry("Small Strawberry", 2, 13, 1.0);
        cart1.addItem(apple1);
        cart1.addItem(strawberry1);
        System.out.println("Total cart value before discounts \t" + cart1.totalCartValue());

        //顾客 B
        System.out.println("Customer B Shopping Cart Checkout... \t");
        ShoppingCart cart2 = new ShoppingCart();
        Fruit apple2 = new Apple("Golden Apple", 2, 8, 1.0);
        Fruit strawberry2 = new Strawberry("Small Strawberry", 2, 13, 1.0);
        Fruit mango2 = new Mango("Big Mango", 2, 20, 1.0);
        cart2.addItem(apple2);
        cart2.addItem(strawberry2);
        cart2.addItem(mango2);
        System.out.println("Total cart value before discounts \t" + cart2.totalCartValue());

        //顾客 C
        System.out.println("Customer B Shopping Cart Checkout... \t");
        ShoppingCart cart3 = new ShoppingCart();
        Fruit apple3 = new Apple("Golden Apple", 2, 8, 1.0);
        Fruit strawberry3 = new Strawberry("Small Strawberry", 2, 13, 0.8);
        Fruit mango3 = new Mango("Big Mango", 5, 20, 1.0);
        cart3.addItem(apple3);
        cart3.addItem(strawberry3);
        cart3.addItem(mango3);
        System.out.println("Total cart value after discounts \t" + cart3.totalCartValue());

        //顾客 D
        System.out.println("Customer B Shopping Cart Checkout... \t");
        ShoppingCart cart4 = new ShoppingCart();
        Fruit apple4 = new Apple("Golden Apple", 2, 8, 1.0);
        Fruit strawberry4 = new Strawberry("Small Strawberry", 2, 13, 0.8);
        Fruit mango4 = new Mango("Big Mango", 5, 20, 1.0);
        cart4.addItem(apple4);
        cart4.addItem(strawberry4);
        cart4.addItem(mango4);
        System.out.println("Total cart value after discounts \t" + cart4.totalCartValue(100,10));




    }
}