package controller;

import model.dao.StudentDao;
import model.entities.Student;
import view.StudentView;

public class StudentController {

    private final StudentDao dao;
    private final StudentView studentView;

    public StudentController(StudentDao dao, StudentView studentView) {
        this.dao = dao;
        this.studentView = studentView;
    }

    public void create() {
        Student student = studentView.createStudent();

        dao.create(student);
    }

    public void remove() {
        Long id = studentView.showIdInput();

        if(dao.deleteById(id)){
            System.out.println("Removed Successfully.");
        } else {
            System.out.println("Failed to remove");
        }
    }

    public void showData() {
        studentView.displayStudent(dao.getAll());
    }

    public void update() {
        Long id = studentView.showIdInput();
        Student stuToUpdate = studentView.createStudent();

        Student studentAfterUpdate = dao.updateById(id, stuToUpdate);

        studentView.displaySingleStudent(studentAfterUpdate);
    }

    public void searchByName() {
        String name = studentView.showNameInput();

        studentView.displayStudent(dao.searchByName(name));
    }

    public void run() {
        while (true) {
            int option = studentView.showMenuAndGetOption();

            switch (option) {
                case 1 -> create();
                case 2 -> showData();
                case 3 -> remove();
                case 4 -> searchByName();
                case 5 -> update();
                case 0 -> {
                    for (char ch : "Exiting...".toCharArray()) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print(ch);
                    }
                    System.exit(0);
                }
            }
        }
    }

}
