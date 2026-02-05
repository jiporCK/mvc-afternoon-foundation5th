package database;

import model.entities.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDb {

    public static List<Student> students = new ArrayList<>(){{
       add(new Student("Long Fou", LocalDate.of(2000, 3,12)));
       add(new Student("Sovanreach", LocalDate.of(2010, 4, 30)));
       add(new Student("Seanghour", LocalDate.of(2005, 12, 20)));
       add(new Student("Lyta", LocalDate.of(2008, 9, 9)));
    }};

}
