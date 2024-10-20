package Assignment4.Strategy;

// Интерфейс PaymentStrategy описывает метод для расчета итоговой стоимости.
public interface PaymentStrategy {
    double calculateFinalPrice(double price); // Метод для расчета финальной стоимости.
}