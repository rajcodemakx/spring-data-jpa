package com.springdatajpa.customQuery.repository;

import com.springdatajpa.customQuery.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // update student set guardianName = 'rahul', guardian_email_address='rahul@gmail.com' where student_id = 2;

    @Modifying
    @Transactional
    @Query("update Student set guardianName = :guardianName,guardianEmailAddress = :guardianEmailAddress where studentId = :studentId")
    public void updateStudentInfo(@Param("guardianName") String guardianName, @Param("guardianEmailAddress") String guardianEmailAddress, @Param("studentId") Integer studentId);


}
