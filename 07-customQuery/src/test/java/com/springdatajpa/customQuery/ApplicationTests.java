package com.springdatajpa.customQuery;

import com.springdatajpa.customQuery.entity.Student;
import com.springdatajpa.customQuery.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class ApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    //@Test
    void contextLoads() {

        Optional<Student> studentList = studentRepository.findById(2);
        log.info(studentList.get().toString());


        // update
        // update student set guardianName = 'rahul', guardian_email_address='rahul@gmail.com' where student_id = 2;
        try {
            studentRepository.updateStudentInfo("alice", "alice@gmail.com", 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Optional<Student> student = studentRepository.findById(2);
        log.info(student.get().toString());


    }

    @Test
    public void sortingMethod() {

        Sort sort = Sort.by("guardianEmailAddress").ascending();

        List<Student> students = studentRepository.findAll(sort);

        for (Student student : students) {
            log.info(student.toString());
        }
    }

}
