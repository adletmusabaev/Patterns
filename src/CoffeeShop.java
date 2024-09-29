public class CoffeeShop {
    private static CoffeeShop instance;

    private CoffeeShop() {
    }

    public static synchronized CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void orderCoffee(Coffee coffee) {
        System.out.println("Order placed: " + coffee);
    }
}