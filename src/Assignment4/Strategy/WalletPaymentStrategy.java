package Assignment4.Strategy;

// Класс WalletPaymentStrategy не добавляет комиссию.
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price; // Без комиссии.
    }
}