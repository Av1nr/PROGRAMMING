// 3. Модуль верхнего уровня зависит ТОЖЕ от абстракции
public class OrderService {
    private PaymentProcessor paymentProcessor; // Зависимость от интерфейса

    // Зависимость ВНЕДРЯЕТСЯ извне (Dependency Injection)
    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(double amount) {
        paymentProcessor.processPayment(amount);
    }
}