package Assignment4.Strategy;

// Главный класс Main для установки разных стратегий оплаты.
public class Main {
    public static void main(String[] args) {
        Order order = new Order(); // Создание заказа.

        // Оплата банковской картой.
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Final price with card: " + order.calculatePrice(1000));

        // Оплата электронным кошельком.
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Final price with wallet: " + order.calculatePrice(1000));

        // Оплата при получении.
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Final price with cash on delivery: " + order.calculatePrice(1000));
    }
}