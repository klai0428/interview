package supermarket;
/**

 * @author Ka Wai Lai

 * @Date 2024-09-10

 */
public class Fruit implements CartItem {
    private String fName;
    private int quantity;
    private double price;
    private double discount = 1.0;

    /**
     * Constructor
     *
     * @param  pName  the name of fruit to be set to
     * @param  quantity  the quantity of fruit to be set to
     * @param  price  the price of fruit to be set to
     * @param  discount  the discount of fruit to be set to
     *
     */
    public Fruit(String pName, int quantity, double price, double discount) {
        if (pName == null || pName.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty");
        }
        this.fName = pName;
        this.price = Math.max(price, 0);
        this.quantity = Math.max(quantity, 0);
        this.discount = Math.max(discount, 0);
    }

    /**
     * Returns the name of a fruit as an integer value
     *
     * @return      name of a fruit
     */
    @Override
    public String getName() {
        return fName;
    }

    /**
     * Returns the quantity of a fruit as an integer value
     *
     * @return      quantity of a fruit
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Returns the price of a fruit as a double value
     *
     * @return      price of a fruit
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Returns the discount of a fruit as a double value
     *
     * @return      discount of a fruit
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Set the price of the fruit
     *
     * @param  pName  the name of fruit to be set to
     */
    public void setName(String pName) {
        if (pName == null || pName.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty");
        }
        this.fName = pName;
    }

    /**
     * Set the price of the fruit
     *
     * @param  quantity  the quantity of fruit to be set to
     */
    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    /**
     * Set the price of the fruit
     *
     * @param  price  the price of fruit to be set to
     */
    @Override
    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }

    /**
     * Set the price of the fruit
     *
     * @param  discount  the discount of fruit to be set to
     */
    public void setDiscount(double discount) {
        this.discount = Math.max(discount, 0);
    }
}