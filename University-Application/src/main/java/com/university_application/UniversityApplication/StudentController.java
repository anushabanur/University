package com.university_application.UniversityApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;



    @GetMapping("/students/{enrollmentNumber}")
    public Student getStudentByEnrollmentNumber(@PathVariable String enrollmentNumber) {
        return studentRepository.findByEnrollmentNumber(enrollmentNumber);
    }



    @GetMapping("/students/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return studentRepository.findByName(name);
    }



}

