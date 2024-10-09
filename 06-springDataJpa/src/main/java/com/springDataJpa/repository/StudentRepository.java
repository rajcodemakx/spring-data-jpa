package com.springDataJpa.repository;

import com.springDataJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // queryBYmethod

    // query annotation


}
