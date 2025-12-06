import java.util.Scanner;
public  abstract class Employee{
    
    protected Scanner enter = new Scanner(System.in);
    private double salary;
    private String work;
    private int age;

    public Employee(){
        this(0 , "No work name" , 0);
    }
    public Employee(double salary , String work , int age){
        this.salary = setsalary(salary);
        this.work = work;
        this.age = setage(age);
    }
    public double setsalary(double newsalary){
        while (newsalary < 0){
            System.out.print("Write new salary: ");
            newsalary = enter.nextDouble();
        }
        salary = newsalary;
        return salary;
    }
    public int setage(int newage){
        while (newage < 0){
            System.out.print("Write new age: ");
            newage = enter.nextInt();
        }
        age = newage;
        return age;
    }
    public abstract void dowork();
    public String sayhellotosomeone(String name){
        return "Hello " + name;
    }
    public double getsalary(){
        return salary;
    }
    public int getage(){
        return age;
    }
    public String getwork(){
        return work;
    }
}
