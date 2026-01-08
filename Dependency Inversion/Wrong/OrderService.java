// Модуль верхнего уровня ЗАВИСИТ от модуля нижнего уровня - НАРУШЕНИЕ DIP!
public class OrderService {
    private SBPPaymentProcessor paymentProcessor; // Жесткая привязка!

    public OrderService(SBPPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor; // Создание зависимости внутри
    }

    public void placeOrder(double amount) {
        // Логика заказа...
        paymentProcessor.processPayment(amount);
    }
}
