package supermarket;

public class Strawberry extends Fruit{

    public Strawberry(String pName, int quantity, double price, double discount) {
        super(pName, quantity, price, discount);
    }

    @Override
    public String getName() {
        return null;
    }
}
