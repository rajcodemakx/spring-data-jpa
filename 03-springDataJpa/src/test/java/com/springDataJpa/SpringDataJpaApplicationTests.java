package com.springDataJpa;

import com.springDataJpa.entity.Student;
import com.springDataJpa.entity.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {

        Student student = Student.builder()
                .studentName("arun")
                .studentEmailId("arun@gmail.com")
                .studentAge(21)
                .guardianName("kumar")
                .guardianEmailId("kumar@gmail.com")
                .guardianMobile("1234567890")
                .build();

        studentRepository.save(student);

    }

}
