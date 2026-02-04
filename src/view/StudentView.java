package view;

import model.Student;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;

public class StudentView {

    public void displayStudent(Student student) {
        Table table = new Table(
                3, BorderStyle.CLASSIC
        );
        table.addCell(
                "Student Details",
                new CellStyle(CellStyle.HorizontalAlign.center),
                3);

        // student data
        table.addCell(" ID ");
        table.addCell(student.getId().toString(), 2);
        table.addCell(" Full Name ");
        table.addCell(student.getFullName(), 2);
        table.addCell(" Date of Birth ");
        table.addCell(student.getDateOfBirth().toString(), 2);

        System.out.println(table.render());
    }

}
