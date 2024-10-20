package Assignment4.Strategy;

// Класс CardPaymentStrategy добавляет комиссию 2%.
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price * 1.02; // Стоимость с комиссией 2%.
    }
}
