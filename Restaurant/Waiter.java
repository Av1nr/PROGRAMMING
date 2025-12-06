public class Waiter extends Employee{
    
    private int ordersNow;
    private boolean isWorking;

    public Waiter(double salary , String work , int age , int ordersNow , boolean isWorking){
        super(salary, work, age);
        this.ordersNow = setordersNow(ordersNow);
        this.isWorking = isWorking;
    }
    public int setordersNow(int newOrdersAmount){
        while(newOrdersAmount < 0){
            System.out.print("Write new amount of orders: ");
            newOrdersAmount = enter.nextInt();
        }
        ordersNow = newOrdersAmount;
        return ordersNow;
    }
    @Override
    public void dowork(){
        if (isWorking){
            System.out.println("Now serving clients");
        }
        else{
            System.out.println("Is doing nothing =(");
        }
    }
    public String madeOrder(String order){
        if(order.equals("null") || order.equals("")){
            return "Wrong order";
        }
        else{
            ordersNow++;
            return "Your order: " + order + " ,  has been added and you can expect it";
        }
    }
}
