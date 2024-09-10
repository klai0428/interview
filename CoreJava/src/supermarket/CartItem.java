package supermarket;

public interface CartItem {
    public String getName();
    public double getPrice();
    public double getDiscount();
    public int getQuantity();
    public void setPrice(double price);
    public void setDiscount(double price);
}
