import java.time.LocalTime;

public class Student {
    private String university;
    private int course;
    public Student(String university, int course) {
        this.university = university;
        this.course = course;
    }
    public void learn() {
        System.out.println("Я учусь в " + university + " на " + course + " курсе");
        System.out.println("Текущее время: " + LocalTime.now());
    }
    public static void main(String[] args) {
        Student student = new Student("СЭМК", 3);
        student.learn();
    }
}
