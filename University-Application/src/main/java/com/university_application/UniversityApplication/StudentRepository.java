package com.university_application.UniversityApplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {



    Student findByEnrollmentNumber(String enrollmentNumber);



    Student findByName(String name);



}
