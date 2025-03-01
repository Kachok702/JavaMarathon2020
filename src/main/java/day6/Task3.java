package day6;

public class Task3 {
    public static void main(String[] args) {
Teacher teacher1 = new Teacher("Елизавета", "математика");
Teacher teacher2 = new Teacher("Жанна", "физика");
Student student1 = new Student("Марсель");
        Student student2 = new Student("Никита");
        Student student3 = new Student("Констанстин");
        teacher1.evalute(student1);
        teacher1.evalute(student2);
        teacher2.evalute(student3);
        teacher2.evalute(student1);
    }
}
