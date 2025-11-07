public class Product{

    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;

    public Product(){
        
        this("Milk" , 50 , "Dairy products" , true , 1);

    }

    public Product(String name , int price , String category){

        this(name , price , category , true , 1);

    }

    public Product(String name , double price , String category , boolean inStock , int quantity){

        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;

    }

    public void displayInfo(){
        String result = name + "\n" + price + "\n" + category + "\n" + inStock + "\n" + quantity;
        System.out.println(result);
    }
    public void applyDiscount(double percent){
        if (percent >= 0 && percent <= 100){
            price -= price * percent * 0.01;
            System.out.println("Price after discount:" + price);
        }
        else if (percent < 0){
            System.out.println("Discount cant be negative");
        }
        else{
            System.out.println("Discount cant be more than 100%");
        }
    }
    public void restock(int amount){
        if (amount > 0){
            quantity += amount;
            System.out.println("Restock storage , now there is:" + quantity);
        }
        else if ( amount <= 0 ){
            System.out.println("We cant restock storage with this amount");
        }
        
    }
    public void sell(int amount){
        if (quantity > amount && amount > 0){
            quantity -= amount;
            System.out.println("Sell amount , now in storage:" + quantity);
        }
        else if(amount <= 0){
            System.out.println("We cant sell negative amount");
        }
        else{
            System.out.println("We cant sell more than we have");
        }
    }
}