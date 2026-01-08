// Модуль нижнего уровня (ДЕТАЛЬ)
class SBPPaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Обработка платежа $" + amount + " через Stripe...");
        // Логика Stripe API
    }
}