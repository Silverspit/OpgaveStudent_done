import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students = new ArrayList<Student>();
    private String courseName;
    private int maxParticipants;
    private int courseYear;

    public Course( String courseName, int maxParticipants, int courseYear ){
        this.courseName = courseName;
        this.maxParticipants = maxParticipants;
        this.courseYear = courseYear;
    }

    // lav getter og setter
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public int getMaxParticipants(){
        return maxParticipants;
    }
    public void setMaxParticipants(int maxParticipants){
        this.maxParticipants = maxParticipants;
    }

    public int getCourseYear(){
        return courseYear;
    }
    public void setCourseYear(int courseYear){
        this.courseYear = courseYear;
    }


    /* lav metoder
      public int addStudent(Student student){
        return Student += student;
      }

      public int removeStudent(int studentId){
        return Student - studentId;
      }

      public void showStudentList(){
          System.out.println(students);
      }

    // lav toString */

    public boolean addStudent(Student student) {
        if (students.size() < maxParticipants) {
            students.add(student);
            System.out.println("Student " + student.getName() + " added to " + courseName);
            return true;
        } else {
            System.out.println("Course is full. Cannot add " + student.getName());
            return false;
        }
    }

    public boolean removeStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                System.out.println("Student " + student.getName() + " removed from " + courseName);
                return true;
            }
        }
        System.out.println("Student with ID " + studentId + " not found in " + courseName);
        return false;
    }

    public void showStudentList() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName() + " (ID: " + student.getStudentId() + ", Age: " + student.getAge() + ")");
        }
    }
}
