package controller;

import model.dao.StudentDao;
import model.entities.Student;
import view.StudentView;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentController {

    private final StudentDao dao;
    private final StudentView studentView;

    public StudentController(StudentDao dao, StudentView studentView) {
        this.dao = dao;
        this.studentView = studentView;
    }

    public void create(Scanner scanner) {
        System.out.print("Enter ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.print("Enter Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter date of birth(2000-04-12): ");
        String dateOfBirth = scanner.nextLine();
        String[] parts = dateOfBirth.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        LocalDate dob = LocalDate.of(year, month, day);

        Student newStudent = new Student(id, fullName, dob);

        dao.create(newStudent);

    }

    public void showData() {
        studentView.displayStudent(dao.getAll());
    }

}
