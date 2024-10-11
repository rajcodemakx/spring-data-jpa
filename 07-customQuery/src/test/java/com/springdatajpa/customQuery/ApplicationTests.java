package com.springdatajpa.customQuery;

import com.springdatajpa.customQuery.entity.Student;
import com.springdatajpa.customQuery.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class ApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {

        for (Student allStudent : studentRepository.getAllStudentsAge(1, 18)) {
            log.info(allStudent.toString());
        }

    }

}
