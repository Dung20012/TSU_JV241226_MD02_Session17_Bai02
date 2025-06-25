package Exercise02;

import Exercise01.Student;
import Exercise01.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Student student = new Student(1, "Nguyễn Văn A", 25); // ID svien cần cập nhật
        manager.updateStudent(student);
    }
}
