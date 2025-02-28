public class Student {
  // lav instans variabler
    private String name;
    private int studentId;
    private int age;

    public Student(String name, int studentId, int age){
        this.name = name;
        this. studentId = studentId;
        this.age = age;
    }

    // lav get og setter
    public String getName(){
          return name;
      }
    public void setName(String name){
          this.name = name; 
      }

    public int getStudentId(){
          return studentId;
      }
    public void setStudentId(int studentId){
          this.studentId = studentId;
      }

    public int getAge(){
          return age;
      }
    public void setAge(int age){
          this.age = age;
      }
    // lav toString metode 
    public String toString(){
        return "Student name is " + name + "your studentid is " + studentId + "your age is " + age;
    }
}
