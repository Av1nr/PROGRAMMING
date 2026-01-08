// Использование
public class Main {
    public static void main(String[] args) {
        // Теперь выбор реализации определяется на верхнем уровне (например, в конфигурации)
        PaymentProcessor processor = new PayPalPaymentProcessor();
        OrderService service = new OrderService(processor); // Внедряем зависимость
        service.placeOrder(100.0);
    }
}