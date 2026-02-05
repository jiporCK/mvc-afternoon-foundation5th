package model.dao;

import model.entities.Student;

import java.util.List;

public interface StudentDao {

    void create(Student student);
    List<Student> getAll();

    boolean deleteById(Long id);

}
