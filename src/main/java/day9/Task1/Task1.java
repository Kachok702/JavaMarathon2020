package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
Student student =new Student("Марсель", "ТЭТ-112");
Teacher teacher =new Teacher("Елизавета", "математика");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        teacher.printInfo();
        student.printInfo();
    }
}
