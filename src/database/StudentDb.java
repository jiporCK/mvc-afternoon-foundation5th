package database;

import model.entities.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDb {

    public static List<Student> students = new ArrayList<>(){{
       add(new Student(1L, "Long Fou", LocalDate.of(2000, 3,12)));
       add(new Student(2L, "Sovanreach", LocalDate.of(2010, 4, 30)));
       add(new Student(3L, "Seanghour", LocalDate.of(2005, 12, 20)));
       add(new Student(4L, "Lyta", LocalDate.of(2008, 9, 9)));
    }};

}
