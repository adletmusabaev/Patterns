package Assignment4.Strategy;


// Класс CashOnDeliveryStrategy добавляет 300 рублей за доставку.
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price + 300; // Добавление стоимости доставки.
    }
}