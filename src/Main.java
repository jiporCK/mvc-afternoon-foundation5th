import controller.StudentController;
import model.dao.StudentDao;
import model.dao.StudentDaoImpl;
import view.StudentView;

public class Main {

    public static void main(String[] args) {

//        Student student = new Student();
        StudentDao dao = new StudentDaoImpl();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(dao, view);

        controller.run();

    }

}
