package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service  // Marks this as a Spring service component
public class StudentService {

    // Inject the repository (this is dependency injection)
    @Autowired
    private StudentRepository studentRepository;

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get one student by ID
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Create a new student
    public Student createStudent(Student student) {
        // You could add validation or business logic here
        return studentRepository.save(student);
    }

    // Update an existing student
    public Student updateStudent(Student student) {
        // You could add validation or business logic here
        return studentRepository.save(student);
    }

    // Delete a student
    public void deleteStudent(Long id) {
        // You could add validation or business logic here
        studentRepository.deleteById(id);
    }

    // You can add more business methods here, for example:
    // public List<Student> findStudentsByCourse(String course) { ... }
    // public void enrollStudentInCourse(Long studentId, String course) { ... }
}
