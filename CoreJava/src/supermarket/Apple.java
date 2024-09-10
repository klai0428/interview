package supermarket;

public class Apple extends Fruit{
    public Apple(String pName, int quantity, double price, double discount) {
        super(pName, quantity, price, discount);
    }

    @Override
    public String getName() {
        return null;
    }
}
