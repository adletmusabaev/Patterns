package Assignment4.Strategy;

// Класс Order принимает стратегию оплаты и рассчитывает итоговую стоимость.
public class Order {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy; // Установка стратегии оплаты.
    }

    public double calculatePrice(double price) {
        return paymentStrategy.calculateFinalPrice(price); // Расчет итоговой стоимости.
    }
}