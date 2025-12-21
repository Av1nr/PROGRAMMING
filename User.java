public class User {
    
    private String username;
    private UserRole role;
    private int age;

    User(String username , UserRole role , int age){
        this.username = username;
        this.role = role;
        this.age = age;
    }
    public String getUsername(){
        return username;
    }
    public UserRole getRole(){
        return role;
    }
    public int getAge(){
        return age;
    }
    public void checkAge(){
        if (getAge() < 18){
            throw new IllegalArgumentException("Eshkere its useless");
        }
        else{
            System.out.println("Welcome to the club Baddy");
        }
    }
}
