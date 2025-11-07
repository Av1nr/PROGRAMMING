public class BankAccount {
    
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String currency;
    private boolean isActive;

    public BankAccount(){
        this("88005553535" , "Askar" , 0 , "Rub" , false );
    }
    
    public BankAccount(String accountNumber , String ownerName){
        this(accountNumber , ownerName , 0 , "Rub" , false);
    }

    public BankAccount(String accountNumber , String ownerName , double balance , String currency , boolean isActive){
        
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
        this.isActive = isActive;

    }

    public String displayInfo(){
        String result = accountNumber + "\n" + ownerName + "\n" + balance + "\n" + currency + "\n" + isActive;
        return result;
    }
    public void deposit(double sumdeposit){
        if (sumdeposit > 0){
            balance += sumdeposit;
        }else{
            System.out.println("Не удалось пополнить счет");
        }
    }
    public void withdraw(double withdrawsum){
        if (balance > withdrawsum){
            balance -= withdrawsum;
        }
        else{
            System.out.println("На вашем счету недостаточно средств для снятия этой суммы");
        }
    }
    public void activateAccount(){
        isActive = true;
    }
    public void deactivateAccount(){
        isActive = false;
    }
}
