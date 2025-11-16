import java.util.Scanner;
//Кафедра
public class Department {

    private final Scanner enter = new Scanner(System.in);
    private String departmentName;
    private String headOfDepartment;
    private String officeRoom;
    private String email;
    private String phoneNumber;
    private double budget;
    private static int totalDepartments = 5;
    private final int UNIVERSITY_BUDGET = 100_000_000;

    public Department(){
        this("null" , "none" , "0" , "a@b.com" , "0" , 0);
    }
    public Department(String departmentName , String headOfDepartment , String email , String phoneNumber){
        this(departmentName , headOfDepartment , "0" , email , phoneNumber , 0);
    }
    public Department(String departmentName , String headOfDepartment ,String officeRoom ,String email , String phoneNumber , double budget){
        while(departmentName.equals("null") || departmentName.equals("") ){
            departmentName = enter.nextLine();
        }
        this.departmentName = departmentName;
        while(headOfDepartment.equals("null") || headOfDepartment.equals("") ){
           headOfDepartment = enter.nextLine();
        }
        this.headOfDepartment = headOfDepartment;
        while(officeRoom.equals("null") || officeRoom.equals("") || !officeRoom.matches("[0-9]")){
            officeRoom = enter.nextLine();
        }
        this.officeRoom = officeRoom;
        while(!email.matches("[A-Za-z0-9]+@[A-Za-z0-9]+\\.(com|ru|org)")){
            email = enter.nextLine();
        }
        this.email = email;
        while(!phoneNumber.matches("[0-9]+")){
            phoneNumber = enter.nextLine();
        }
        this.phoneNumber = phoneNumber;
        while(budget > UNIVERSITY_BUDGET || budget < 0){
            budget = enter.nextDouble();
        }
        this.budget = budget;
    }
    public double setbudget(int newbudget){
        while (newbudget < 0 || newbudget > UNIVERSITY_BUDGET){
            System.out.print("Write newbudget: ");
            newbudget = enter.nextInt();
        }
        budget = newbudget;
        return budget;
    }
    public String setdepartmentName(String newName){
        departmentName = newName;
        return departmentName;
    }
    public String setheadOfDepartment(String newhead){
        headOfDepartment = newhead;
        return headOfDepartment;
    }
    public String setofficeRoom(String newroom){
        officeRoom = newroom;
        return officeRoom;
    }
    public String setphoneNumber(String newnumber){
        phoneNumber = newnumber;
        return phoneNumber;
    }
    public String setemail(String newemail){
        while(!newemail.matches("[A-Za-z0-9]+@[A-Za-z0-9]+\\.(com|ru|org)")){
            System.out.print("Last email wasn`t correct write new one: ");
            newemail = enter.nextLine();
        }
        email = newemail;
        return email;
    }
    
    public String getphoneNumber(){
        return phoneNumber;
    }
    public String getofficeRoom(){
        return officeRoom;
    }
    public String getheadOfDepartment(){
        return headOfDepartment;
    }
    public String getdepartmentName(){
        return departmentName;
    }
    public double getbudget(){
        return budget;
    }
    public String getemail(){
        return email;
    }
    public static int gettotalDepartments(){
        return totalDepartments;
    }

    public String contact(){
        return "Your message has been sent ";
    }
    public String contact (String message){
        return message + " has been sent";
    }
    public double allocateBudget(double amount){
        while (amount > budget || amount < 0){
            System.out.println("Wrong amount , more than we have or negative, write again: ");
            amount = enter.nextInt();
        }
        budget -= amount;
        return budget;
    }
    public String allocateBudget(double amount , String purpose){
        while (amount > budget || amount < 0){
            System.out.println("Wrong amount , more than we have or negative, write again: ");
            amount = enter.nextInt();
        }
        budget -= amount;
        return "We give you " +  Double.toString(budget) + "on" + purpose;
    }

    public String displayInfo(){
        return departmentName +"\n"+headOfDepartment +"\n"+officeRoom +"\n"+email+"\n"+phoneNumber+"\n"+budget+"\n"+totalDepartments+"\n"+UNIVERSITY_BUDGET;
    }
}
