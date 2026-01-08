// 2. Модуль нижнего уровня (ДЕТАЛЬ) зависит от абстракции
public class SBPPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежа $" + amount + " через Stripe...");
    }
}