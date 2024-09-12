package supermarket;

import java.util.ArrayList;
import java.util.List;

/**

 * @author Ka Wai Lai

 * @Date 2024-09-10

 */
public class ShoppingCart {
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

    /**
     * Returns the total price of a Shopping cart as a double value.
     *
     * @return      total price of a Shopping cart
     */
    public double totalCartValue() {
        double total = 0d;
        for (CartItem item : items) {
            total += item.getPrice() * item.getQuantity() * item.getDiscount();
        }
        return (double) Math.round(total * 100000d) / 100000d;
    }

    /**
     * Returns the total price of a Shopping cart as a double value.
     *
     * @param  threshold  the promotional threshold
     * @param  PromotionalSaveOff the save off value of the total price of an order that exceeds threshold specified
     * @return      total price of a Shopping cart in promotional price
     */
    public double totalCartValue(double threshold, double PromotionalSaveOff) {
        double total = 0d;
        for (CartItem item : items) {
            total += item.getPrice() * item.getQuantity() * item.getDiscount();
        }
        total = (total > threshold) ? total - PromotionalSaveOff : total;
        return (double) Math.round(total * 100000d) / 100000d;
    }
}
