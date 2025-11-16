import java.util.Scanner;
//Студент
public class Student {
    private final Scanner enter = new Scanner(System.in);
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;
    private String faculty;
    private static int totalStudents = 1000;
    private final String UNIVERSITY_NAME;

    public Student(){
        this("0" , "null" , "null" , 0 , 0 , "ITIS");
    }
    public Student(String firstName , String lastName , int age , double averageGrade , String faculty){
        this("0" , firstName , lastName , age , averageGrade , faculty);
    }
    public Student(String studentId , String firstName , String lastName , int age , double averageGrade , String faculty){
        while(studentId.equals("null") || studentId.equals("") ){
            studentId = enter.nextLine();
        }
        this.studentId = studentId;
         while(firstName.equals("null") || firstName.equals("") ){
            firstName = enter.nextLine();
        }
        this.firstName = firstName;
        while(lastName.equals("null") || lastName.equals("") ){
            lastName = enter.nextLine();
        }
        this.lastName = lastName;
        while(age < 14 || age > 30){
            age = enter.nextInt();
        }
        this.age = age;
        while(averageGrade > 5 || averageGrade < 0){
            averageGrade = enter.nextDouble();
        }
        this.averageGrade = averageGrade;
        while(faculty.equals("null") || faculty.equals("") ){
            faculty = enter.nextLine();
        }
        this.faculty = faculty;
        this.UNIVERSITY_NAME = "KFU";
        
    }
    public static int getTotalStudents(){
        return totalStudents;
    }
    public String getstudentId(){
        return studentId;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getfaculty(){
        return faculty;
    }
    public String getUNIVERSITY_NAME(){
        return UNIVERSITY_NAME;
    }
    public int getage(){
        return age;
    }
    public double getaverageGrade(){
        return averageGrade;
    }
    public int setage(int x){
        while (x <= 16 || x >= 70){
            System.out.print("Wrong age, write new one: ");
            x = enter.nextInt();
        }
        return x;
    }
    public double setaverageGrade(int x){
        while (x <= 0 || x >= 5){
            System.out.print("Wrong aveagegrade, write new one: ");
            x = enter.nextInt();
        }
        return x;
    }
    public String setstudentId(String newId){
        while(!newId.equals("") || !newId.equals("null")){
            System.out.print("Wrong Id, write new one: ");
            newId = enter.nextLine();
        }
        return newId;
    }
    public String displayInfo(boolean detailed){
        if (detailed == true){
            return studentId + "\n" + firstName + "\n" + lastName + "\n" + age + averageGrade + "\n" + faculty + "\n" + totalStudents + "\n" + UNIVERSITY_NAME;
        }
        else{
            return studentId + "\n" + firstName + "\n" + lastName + "\n" + age + "\n" + faculty;
        }
    }
    public String displayInfo(){
        return studentId + "\n" + firstName + "\n" + lastName + "\n" + age + averageGrade + "\n" + faculty + "\n" + totalStudents + "\n" + UNIVERSITY_NAME;
    }
    public double updateGrade(double newGrade){
        while (newGrade <= 0 || newGrade >= 5){
            System.out.print("Wrong aveagegrade, write new one: ");
            newGrade = enter.nextInt();
        }
        return newGrade;
    }
    public String updateGrade(double newGrade , String subject){
        while (newGrade <= 0 || newGrade >= 5){
            System.out.print("Wrong aveagegrade, write new one: ");
            newGrade = enter.nextInt();
        }
        return subject + "now new grade: " + newGrade;
    }
}