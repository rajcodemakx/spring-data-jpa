package com.springDataJpa;

import com.springDataJpa.entity.Guardian;
import com.springDataJpa.entity.Student;
import com.springDataJpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void contextLoads() {

        Guardian guardian = Guardian.builder()
                .name("kumar")
                .emailId("kumar@gmail.com")
                .contact("1234567890")
                .build();

        Student student = Student.builder()
                .studentFirstName("arun")
                .studentLastName("kumar")
                .studentEmailId("arun@gmail.com")
                .studentAge(21)
                .studentDOB("28-11-1998")
                .studentMobileNumber("9876543210")
                .guardian(guardian)
                .build();

        Student savedStudent = studentRepository.save(student);

        // Fetch the saved student from the repository
        Student fetchedStudent = studentRepository.findById(savedStudent.getStudentId()).orElse(null);

        // Assertions to verify the saved data
        assertNotNull(fetchedStudent, "The student should have been saved and fetched");
        assertEquals("arun", fetchedStudent.getStudentFirstName(), "First name should match");
        assertEquals("kumar", fetchedStudent.getStudentLastName(), "Last name should match");
        assertEquals("arun@gmail.com", fetchedStudent.getStudentEmailId(), "Email should match");
        assertEquals(21, fetchedStudent.getStudentAge(), "Age should match");
        assertEquals("28-11-1998", fetchedStudent.getStudentDOB(), "Date of birth should match");
        assertEquals("9876543210", fetchedStudent.getStudentMobileNumber(), "Mobile number should match");

        // Verify guardian details
        assertNotNull(fetchedStudent.getGuardian(), "Guardian should not be null");
        assertEquals("kumar", fetchedStudent.getGuardian().getName(), "Guardian name should match");
        assertEquals("kumar@gmail.com", fetchedStudent.getGuardian().getEmailId(), "Guardian email should match");
        assertEquals("1234567890", fetchedStudent.getGuardian().getContact(), "Guardian contact should match");
    }

}


