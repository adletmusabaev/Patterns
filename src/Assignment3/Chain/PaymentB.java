package Assignment3.Chain;

// Класс для метода оплаты B
class PaymentB extends PaymentHandler {

    @Override
    public void handlePayment(int amount) {
        // Баланс метода оплаты B
        int balance = 300;
        if (balance >= amount) {
            // Если баланс достаточный, выполняем оплату
            System.out.println("Payment handled by B");
        } else if (nextHandler != null) {
            // Если недостаточно средств, передаем обработку дальше по цепочке
            nextHandler.handlePayment(amount);
        }
    }
}