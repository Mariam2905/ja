package org.example.experiments.university.repository;

import org.example.experiments.university.model.address.Address;
import org.example.experiments.university.model.human.student.Degree;
import org.example.experiments.university.model.human.student.Student;

import java.util.List;

public interface StudentRepository {
    void add(Student student);

    Student deleteBy(int id);

    List<Student> deleteAll();

    List<Student> getAll();

    List<Student> getAllBy(String firstName);

    List<Student> getAllBy(String firstName, String lastName);

    List<Student> getAllBy(Degree degree);

    Student getBy(int id);

    List<Address> getAddressListBy(int id);
}