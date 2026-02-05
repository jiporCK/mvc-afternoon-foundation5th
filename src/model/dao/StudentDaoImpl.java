package model.dao;

import database.StudentDb;
import model.entities.Student;

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

    @Override
    public boolean deleteById(Long id) {
        return StudentDb.students.removeIf(
                student -> student.getId().equals(id)
        );
    }

    @Override
    public Student updateById(Long id, Student student) {
        for (int i = 0; i < StudentDb.students.size(); i++) {
            if (StudentDb.students.get(i).getId().equals(id)) {
                StudentDb.students.get(i).setId(id);
                StudentDb.students.get(i).setFullName(student.getFullName());
                StudentDb.students.get(i).setDateOfBirth(student.getDateOfBirth());
                return StudentDb.students.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Student> searchByName(String name) {

        return StudentDb.students.stream()
                .filter(stu -> stu.getFullName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

}
