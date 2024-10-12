package Assignment3.Chain;

// Основной класс для демонстрации цепочки обязанностей
public class Main {
    public static void main(String[] args) {
        // Создаем объекты для методов оплаты
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        // Устанавливаем цепочку: A -> B -> C
        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        int purchaseAmount = 210; // Сумма покупки
        paymentA.handlePayment(purchaseAmount); // Начинаем проверку с метода оплаты A
    }
}