package supermarket;

public class Mango extends Fruit{
    public Mango(String pName, int quantity, double price, double discount) {
        super(pName, quantity, price, discount);
    }

    @Override
    public String getName() {
        return null;
    }
}
