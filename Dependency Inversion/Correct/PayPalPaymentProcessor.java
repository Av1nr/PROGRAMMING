// Новая деталь, которую можно легко добавить
public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежа $" + amount + " через PayPal...");
    }
}