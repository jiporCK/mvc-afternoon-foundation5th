import controller.StudentController;
import model.Student;
import view.StudentView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.create(new Scanner(System.in));
        controller.showData();


    }

}
