
public class StudentManager {

    private Student[] students;
    private Course[] courses;

    public StudentManager(Student[] students , Course[] courses){
        this.students = students;
        this.courses = courses;
    }
    public Student findStudentById(String studentId) {
    if (studentId == null) return null;
    
    for (Student student : students) {
        if (studentId.equals(student.getstudentId())) {
            return student;
        }
    }
    return null;
    }
    public String getStudentsByFaculty(String faculty) {
    String facultyStudents = "";
    
    for (Student student : students) {
        if (faculty != null && faculty.equals(student.getfaculty())) {
            facultyStudents += student;
        }
    }
    return facultyStudents;
    }
}
