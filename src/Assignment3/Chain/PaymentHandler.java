package Assignment3.Chain;

// Абстрактный класс для всех обработчиков платежей
abstract class PaymentHandler {
    protected PaymentHandler nextHandler; // Следующий обработчик в цепочке

    // Метод для установки следующего обработчика
    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Абстрактный метод для обработки платежа
    public abstract void handlePayment(int amount);
}