package dao;

import database.StudentDb;
import model.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao{
    @Override
    public void create(Student student) {
        StudentDb.students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return StudentDb.students;
    }
}
