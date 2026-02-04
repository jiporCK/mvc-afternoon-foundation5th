package dao;

import model.Student;

import java.util.List;

public interface StudentDao {

    void create(Student student);
    List<Student> getAll();

}
