public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java",2, 2025);

        Student student1 = new Student("Alice", 1, 20);
        Student student2 = new Student("Bob", 2, 22);
        Student student3 = new Student("Charlie", 3, 21);

        javaCourse.addStudent(student1);
        javaCourse.addStudent(student2);
        javaCourse.addStudent(student3); // This should fail as maxParticipants is 2

        javaCourse.showStudentList();

        javaCourse.removeStudent(2);
        javaCourse.showStudentList();
    }
}