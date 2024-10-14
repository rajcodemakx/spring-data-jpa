package com.springdatajpa.customQuery;

import com.springdatajpa.customQuery.entity.Student;
import com.springdatajpa.customQuery.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    // @Test
    public void sortingMethod() {

        Sort sort = Sort.by("guardianEmailAddress").ascending();

        List<Student> students = studentRepository.findAll(sort);

        for (Student student : students) {
            log.info(student.toString());
        }
    }

    @Test
    public void paginationMethod() {

        // 1 --> 3 data ==> 20/3 = 6.66 (round off)

        long count = studentRepository.count();
        int pageSize = 3;
        
        int pages = (int) Math.ceil((double)count/pageSize);
        System.out.println("################ "+pages);
        for (int i = 0; i <= pages; i++) {
            PageRequest pageRequest = PageRequest.of(i, 3,Sort.by("studentId").ascending());

            Page<Student> studentsPage = studentRepository.findAll(pageRequest);

            List<Student> students = studentsPage.getContent();

            for (Student student : students) {
                log.info(student.toString());
            }
        }


    }

}
