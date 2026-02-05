package view;

import model.entities.Student;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentView {

    private static final Scanner scanner = new Scanner(System.in);

    public Student createStudent() {
        System.out.print("[+] Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("[+] Enter Date of Birth(Format: 2000-12-31): ");
        String dob = scanner.nextLine();
        String[] parts = dob.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        LocalDate dateOfBirth = LocalDate.of(year, month, day);

        return new Student(name, dateOfBirth);
    }

    public void displayStudent(List<Student> students) {
        Table table = new Table(
                3, BorderStyle.CLASSIC
        );
        table.addCell(" ID ");
        table.addCell(" Name ");
        table.addCell(" DoB ");

        students.forEach(student -> {
            table.addCell(student.getId().toString());
            table.addCell(student.getFullName());
            table.addCell(student.getDateOfBirth().toString());
        });

        System.out.println(table.render());
    }

    public void displaySingleStudent(Student student) {
        Table table = new Table(
                3, BorderStyle.UNICODE_BOX_DOUBLE_BORDER
        );
        table.addCell("Student Details",
                new CellStyle(CellStyle.HorizontalAlign.center),
                3);
        table.addCell("ID");
        table.addCell(student.getId().toString(), 2);
        table.addCell("Full Name");
        table.addCell(student.getFullName(), 2);
        table.addCell("Date of Birth");
        table.addCell(student.getDateOfBirth().toString(), 2);

        System.out.println(table.render());
    }

    public Long showIdInput() {
        System.out.print("[!] Enter id: ");
        return Long.parseLong(scanner.nextLine());
    }

    public String showNameInput() {
        System.out.print("[!] Enter name to search: ");
        return scanner.nextLine();
    }

    public int showMenuAndGetOption() {
        System.out.println("""
                    1. Create
                    2. Display All Students
                    3. Remove Student
                    4. Search By Name
                    5. Update By Id
                    0. Exit""");
        System.out.print("Choose an option: ");
        return Integer.parseInt(scanner.nextLine());
    }

}
