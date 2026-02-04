import controller.StudentController;
import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;
import view.StudentView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Student student = new Student();
        StudentDao dao = new StudentDaoImpl();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(dao, view);

        controller.create(new Scanner(System.in));
        controller.showData();


    }

}
