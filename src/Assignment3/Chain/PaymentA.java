package Assignment3.Chain;

// Класс для метода оплаты A
class PaymentA extends PaymentHandler {

    @Override
    public void handlePayment(int amount) {
        // Баланс метода оплаты A
        int balance = 100;
        if (balance >= amount) {
            // Если баланс достаточный, выполняем оплату
            System.out.println("Payment handled by A");
        } else if (nextHandler != null) {
            // Если недостаточно средств, передаем обработку дальше по цепочке
            nextHandler.handlePayment(amount);
        }
    }
}