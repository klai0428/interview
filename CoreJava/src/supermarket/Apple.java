package supermarket;
/**

 * @author Ka Wai Lai

 * @Date 2024-09-10

 */
public class Apple extends Fruit{
    /**
     * Constructor
     *
     * @param  pName  the name of Apple to be set to
     * @param  quantity  the quantity of Apple to be set to
     * @param  price  the price of Apple to be set to
     * @param  discount  the discount of Apple to be set to
     *
     */
    public Apple(String pName, int quantity, double price, double discount) {
        super(pName, quantity, price, discount);
    }

    /**
     * Returns the Fruit name.
     *
     * @return      Fruit name
     */
    @Override
    public String getName() {
        return null;
    }
}
