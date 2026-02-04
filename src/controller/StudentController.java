package controller;

import model.Student;
import view.StudentView;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentController {

    private final Student student;
    private final StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
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

        student.setId(id);
        student.setFullName(fullName);
        student.setDateOfBirth(dob);
    }

    public void showData() {
        studentView.displayStudent(student);
    }

}
