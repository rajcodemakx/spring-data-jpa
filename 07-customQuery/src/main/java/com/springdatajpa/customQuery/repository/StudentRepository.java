package com.springdatajpa.customQuery.repository;

import com.springdatajpa.customQuery.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

//    @Query("From Student s") // HQL
//    Iterable<Student> getAllStudents();

    @Query(value = "select * from Student where student_id = :studentId",nativeQuery = true)
    Iterable<Student> getAllStudents(@Param("studentId") int studentId);

    @Query(value = "select * from Student where student_id = :studentId and age = :age",nativeQuery = true)
    Iterable<Student> getAllStudentsAge(@Param("studentId") int studentId,@Param("age") int age);


// Sout("My age is :".concat(age)) + , .concat(age)
// update

    // sorting
    // pagination
    // update @Modifying @Tractionsal

    
}
