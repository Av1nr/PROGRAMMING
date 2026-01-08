class WrongDelivery{
    public void processDelivery(String type) {
        if (type.equals("standard")) {
            System.out.println("Standard delivery processing");
        } else if (type.equals("express")) {
            System.out.println("Express delivery processing");
        }
        // Добавление новой доставки потребует изменения этого метода
    }
}