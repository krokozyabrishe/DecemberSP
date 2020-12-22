package rd.epam.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        Student student = new Student("Андрей", "Юрьевич");
        student.setGroup(Group.FIRST);
        student.setSecondName("Иванов");

        students.add(student);

 	Student newstudent = new Student("Владислав", "Валентинович");
        newstudent.setGroup(Group.FIRST);
        newstudent.setSecondName("Вишневский");

        students.add(newstudent);

        students.forEach(System.out::println);
    }
}
