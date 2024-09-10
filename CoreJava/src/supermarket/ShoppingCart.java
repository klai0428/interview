package supermarket;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Cart {
    private List<CartItem> items = new ArrayList<>();

    public boolean addItem(CartItem item) {
        return items.add(item);
    }
    public boolean removeItem(CartItem item) {
        items.remove(item);
        return true;
    }
    public List<CartItem> getItems() {
        return items;
    }

    public double totalCartValue() {
        double total = 0d;
        for (CartItem item : items) {
            total += item.getPrice() * item.getQuantity() * item.getDiscount();
        }
        return (double) Math.round(total * 100000d) / 100000d;
    }

    public double totalCartValue(double threshold, double PromotionalSaveOff) {
        double total = 0d;
        for (CartItem item : items) {
            total += item.getPrice() * item.getQuantity() * item.getDiscount();
        }
        total = (total > threshold) ? total - PromotionalSaveOff : total;
        return (double) Math.round(total * 100000d) / 100000d;
    }
}
