package supermarket;
/**

 * @author Ka Wai Lai

 * @Date 2024-09-10

 */
public interface CartItem {
    /**
     * Returns the name of the fruit purchased
     *
     * @return      total price of a Shopping cart
     */
    public String getName();
    /**
     * Returns the price of the fruit purchased
     *
     * @return      total price of a Shopping cart
     */
    public double getPrice();
    /**
     * Returns the discount of the fruit purchased
     *
     * @return      total price of a Shopping cart
     */
    public double getDiscount();
    /**
     * Returns the quantity of the fruit purchased
     *
     * @return      total price of a Shopping cart
     */
    public int getQuantity();
    /**
     * Set the price of the fruit
     *
     * @param  price  the price of fruit to be set to
     */
    public void setPrice(double price);
    /**
     * Set the price of the fruit
     *
     * @param  discount  the discount of fruit to be set to
     */
    public void setDiscount(double discount);
}
