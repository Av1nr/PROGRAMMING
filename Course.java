import java.util.Scanner;
//Курс
public class Course {

    private final Scanner enter = new Scanner(System.in);
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private boolean isActive;
    private static int totalCourse = 5;

    public Course(){
        this("0" , "null" , 0 , 0 , false );
    }
    public Course(String courseName , int currentStudents , boolean isActive){
        this("0" , courseName , 0 , currentStudents , isActive);
    }
    public Course(String courseCode , String courseName , int maxStudents , int currentStudents , boolean isActive){
        while(courseCode.equals("null") || courseCode.equals(" ")){
            courseCode = enter.nextLine();
        }
        this.courseCode = courseCode;
        while(courseName.equals("null") || courseName.equals(" ")){
            courseName = enter.nextLine();
        }
        this.courseName = courseName;
        while(maxStudents <0){
            maxStudents = enter.nextInt();
        }
        this.maxStudents = maxStudents;
        while(currentStudents <0 || currentStudents > maxStudents){
            currentStudents = enter.nextInt();
        }
        this.currentStudents = currentStudents;
        this.isActive = isActive;
        
    }
    public static int gettotalCourse(){
        return totalCourse;
    }
    public String getcourseCode(){
        return courseCode;
    }
    public String getcourseName(){
        return courseName;
    }
    public int getmaxStudents(){
        return maxStudents;
    }
    public int getcurrentStudents(){
        return currentStudents;
    }
    public boolean getisActive(){
        return isActive;
    }
    public String setcourseCode(String newcourseCode){
        courseCode = newcourseCode;
        return courseCode;
    }
    public String setcourseName(String newcourseName){
        courseName = newcourseName;
        return courseName;
    }
    public int setmaxStudents(int newmax){
        maxStudents = newmax;
        return maxStudents;
    }
    public int setcurrentStudents(int newcurrent){
        while (maxStudents <= newcurrent){
            System.out.print("More than max students write new amount: ");
            newcurrent = enter.nextInt();
        }
        currentStudents = newcurrent;
        return currentStudents;
    }

    public String enrollStudent(){
        if (maxStudents >= currentStudents + 1){
            return "Now there: " + Integer.toString(maxStudents + 1);
        }
        else{
            return "Already max students";
        }
    }
    public String enrollStudent(String studentId){
        if (maxStudents >= currentStudents + 1){
            return "Student with " + studentId + " Id was added , now there: " + Integer.toString(maxStudents + 1) + " students";
        }
        else{
            return "Already max students";
        }
    }
    public String displayInfo(){
        return courseCode + "\n" + courseName + "\n" + maxStudents + "\n" + currentStudents + "\n" + isActive + "\n" + totalCourse;
    }
    public String displayInfo(boolean showAvailability){
        while (showAvailability != isActive){ 
            System.out.print("Write one : True/false");
            showAvailability = enter.nextBoolean();
            
        }
        if (showAvailability && isActive){
            return courseCode + "\n" + courseName + "\n" + maxStudents + "\n" + currentStudents + "\n" + isActive;
        }
        else{
            return courseCode + "\n" + courseName + "\n" + maxStudents + "\n" + currentStudents + "\n" + isActive;
        }
        
    }
}
