package Assignment3.Chain;

// Класс для метода оплаты C
class PaymentC extends PaymentHandler {

    @Override
    public void handlePayment(int amount) {
        // Баланс метода оплаты C
        int balance = 1000;
        if (balance >= amount) {
            // Если баланс достаточный, выполняем оплату
            System.out.println("Payment handled by C");
        } else {
            // Если нигде нет достаточных средств, выводим сообщение
            System.out.println("Insufficient funds in all payment methods");
        }
    }
}