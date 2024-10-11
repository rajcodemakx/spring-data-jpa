package com.springDataJpa.repository;

import com.springDataJpa.entity.Student;
import org.hibernate.annotations.processing.Find;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

//                            1. Find-By Methods
//                            2. Custom queries

    public Iterable<Student> findByAge(int age);

    // select * from student where age > 18;
    public Iterable<Student> findByAgeGreaterThan(int age);


    // select * from student where age > 18 and student_name = 'kumar';

    public  Iterable<Student> findByAgeGreaterThanAndStudentName(int age,String studentName);


}
