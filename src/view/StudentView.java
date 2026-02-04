package view;

import model.Student;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class StudentView {

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

}
