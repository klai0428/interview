package supermarket;

public class Fruit implements CartItem {
    String fName;
    int quantity;
    double price;
    double discount = 1.0;

    public Fruit(String pName, int quantity, double price, double discount) {
        if (pName == null || pName.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty");
        }
        this.fName = pName;
        this.price = Math.max(price, 0);
        this.quantity = Math.max(quantity, 0);
        this.discount = Math.max(discount, 0);
    }

    @Override
    public String getName() {
        return fName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setfName(String pName) {
        if (pName == null || pName.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty");
        }
        this.fName = pName;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    @Override
    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }

    public void setDiscount(double discount) {
        this.discount = Math.max(discount, 0);
    }
}