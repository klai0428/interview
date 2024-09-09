package supermarket;

import java.util.ArrayList;

public class ShoppingCart {
    String fruitName = "";
    int fruitPrice = 0;
    int quantity = 0;
    double discount = 1.0;

    public ShoppingCart(String fruitName, int fruitPrice, int quantity, double discount) {
        if (fruitName == null || fruitName.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty");
        }
        this.fruitName = fruitName;
        this.fruitPrice = Math.max(fruitPrice, 0);
        this.quantity = Math.max(quantity, 0);
        this.discount = Math.max(discount, 0);
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getFruitPrice() {
        return fruitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setFruitName(String fruitName) {
        if (fruitName == null || fruitName.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty");
        }
        this.fruitName = fruitName;
    }

    public void setFruitPrice(int fruitPrice) {
        this.fruitPrice = Math.max(fruitPrice, 0);
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(fruitPrice, 0);
    }

    public void setDiscount(double discount) {
        this.discount = Math.max(discount, 0);
    }

    public static double calculatePrice(ArrayList<ShoppingCart> items) {
        double totalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            totalPrice += (items.get(i).getFruitPrice() * items.get(i).getQuantity());
        }
        return totalPrice;
    }

    public static double calculatePrice(ArrayList<ShoppingCart> items, double discount ) {
        double totalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getFruitName().equalsIgnoreCase("Strawberry")) {
                totalPrice += items.get(i).getFruitPrice() * items.get(i).getQuantity() * items.get(i).getDiscount();
            }
            else {
                totalPrice += items.get(i).getFruitPrice() * items.get(i).getQuantity();
            }
        }
        return totalPrice;
    }


    public static void main(String[] args) {
        ArrayList<ShoppingCart> shoppingCart = new ArrayList<>();
        //question 1 & 2
//        ShoppingCart item1 = new ShoppingCart("Apple",8, 2,1.0);
//        ShoppingCart item2 = new ShoppingCart("Strawberry",13, 3,1.0);
//        ShoppingCart item3 = new ShoppingCart("Mango",20, 1,1.0);
//
//        shoppingCart.add(item1);
//        shoppingCart.add(item2);
//        shoppingCart.add(item3);
//
//        for (int i = 0; i < shoppingCart.size(); i++) {
//            System.out.println("Fruit Name: " + shoppingCart.get(i).getFruitName());
//            System.out.println("Fruit Name: " + shoppingCart.get(i).getFruitPrice());
//        }
//
//        System.out.println(calculatePrice(shoppingCart));
//
//        System.out.println("Cleaning shopping cart...");
//        shoppingCart.clear();

        //question 3
        ShoppingCart item4 = new ShoppingCart("Apple",8, 2,1.0);
        ShoppingCart item5 = new ShoppingCart("Strawberry",13, 3,0.8);
        ShoppingCart item6 = new ShoppingCart("Mango",20, 1,1.0);

        shoppingCart.add(item4);
        shoppingCart.add(item5);
        shoppingCart.add(item6);

        System.out.println(calculatePrice(shoppingCart,0.8));


    }
}
