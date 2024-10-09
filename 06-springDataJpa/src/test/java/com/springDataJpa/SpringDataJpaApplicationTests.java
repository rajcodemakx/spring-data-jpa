package com.springDataJpa;

import com.springDataJpa.entity.Guardian;
import com.springDataJpa.entity.Student;
import com.springDataJpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {

		Guardian guardian = Guardian.builder()
				.name("john")
				.email("john@gmail.com")
				.mobileNumber("9876543210")
				.build();

		Student student = Student.builder()
				.studentName("kumar")
				.age(18)
				.studentEmailId("kumar@gmail.com")
				.studentMobileNumber("1234567890")
				.guardian(guardian)
				.build();

		Student saved = studentRepository.save(student);

		List<Student> students = Arrays.asList(
				Student.builder()
						.studentName("kumar")
						.age(18)
						.studentEmailId("kumar@gmail.com")
						.studentMobileNumber("1234567890")
						.guardian(Guardian.builder().name("john").email("john@gmail.com").mobileNumber("9876543210").build())
						.build(),
				Student.builder()
						.studentName("anitha")
						.age(20)
						.studentEmailId("anitha@gmail.com")
						.studentMobileNumber("1234567891")
						.guardian(Guardian.builder().name("alice").email("alice@gmail.com").mobileNumber("9876543211").build())
						.build(),
				Student.builder()
						.studentName("ravi")
						.age(21)
						.studentEmailId("ravi@gmail.com")
						.studentMobileNumber("1234567892")
						.guardian(Guardian.builder().name("robert").email("robert@gmail.com").mobileNumber("9876543212").build())
						.build(),
				Student.builder()
						.studentName("priya")
						.age(19)
						.studentEmailId("priya@gmail.com")
						.studentMobileNumber("1234567893")
						.guardian(Guardian.builder().name("carol").email("carol@gmail.com").mobileNumber("9876543213").build())
						.build(),
				Student.builder()
						.studentName("raj")
						.age(22)
						.studentEmailId("raj@gmail.com")
						.studentMobileNumber("1234567894")
						.guardian(Guardian.builder().name("david").email("david@gmail.com").mobileNumber("9876543214").build())
						.build(),
				Student.builder()
						.studentName("meena")
						.age(20)
						.studentEmailId("meena@gmail.com")
						.studentMobileNumber("1234567895")
						.guardian(Guardian.builder().name("emma").email("emma@gmail.com").mobileNumber("9876543215").build())
						.build(),
				Student.builder()
						.studentName("vijay")
						.age(19)
						.studentEmailId("vijay@gmail.com")
						.studentMobileNumber("1234567896")
						.guardian(Guardian.builder().name("frank").email("frank@gmail.com").mobileNumber("9876543216").build())
						.build(),
				Student.builder()
						.studentName("sunitha")
						.age(21)
						.studentEmailId("sunitha@gmail.com")
						.studentMobileNumber("1234567897")
						.guardian(Guardian.builder().name("grace").email("grace@gmail.com").mobileNumber("9876543217").build())
						.build(),
				Student.builder()
						.studentName("arjun")
						.age(23)
						.studentEmailId("arjun@gmail.com")
						.studentMobileNumber("1234567898")
						.guardian(Guardian.builder().name("henry").email("henry@gmail.com").mobileNumber("9876543218").build())
						.build(),
				Student.builder()
						.studentName("deepa")
						.age(18)
						.studentEmailId("deepa@gmail.com")
						.studentMobileNumber("1234567899")
						.guardian(Guardian.builder().name("irene").email("irene@gmail.com").mobileNumber("9876543219").build())
						.build(),
				Student.builder()
						.studentName("manoj")
						.age(22)
						.studentEmailId("manoj@gmail.com")
						.studentMobileNumber("1234567800")
						.guardian(Guardian.builder().name("jack").email("jack@gmail.com").mobileNumber("9876543220").build())
						.build(),
				Student.builder()
						.studentName("shreya")
						.age(19)
						.studentEmailId("shreya@gmail.com")
						.studentMobileNumber("1234567801")
						.guardian(Guardian.builder().name("karen").email("karen@gmail.com").mobileNumber("9876543221").build())
						.build(),
				Student.builder()
						.studentName("akash")
						.age(20)
						.studentEmailId("akash@gmail.com")
						.studentMobileNumber("1234567802")
						.guardian(Guardian.builder().name("leo").email("leo@gmail.com").mobileNumber("9876543222").build())
						.build(),
				Student.builder()
						.studentName("reena")
						.age(21)
						.studentEmailId("reena@gmail.com")
						.studentMobileNumber("1234567803")
						.guardian(Guardian.builder().name("maria").email("maria@gmail.com").mobileNumber("9876543223").build())
						.build(),
				Student.builder()
						.studentName("vinay")
						.age(23)
						.studentEmailId("vinay@gmail.com")
						.studentMobileNumber("1234567804")
						.guardian(Guardian.builder().name("nathan").email("nathan@gmail.com").mobileNumber("9876543224").build())
						.build(),
				Student.builder()
						.studentName("lavanya")
						.age(20)
						.studentEmailId("lavanya@gmail.com")
						.studentMobileNumber("1234567805")
						.guardian(Guardian.builder().name("oliver").email("oliver@gmail.com").mobileNumber("9876543225").build())
						.build(),
				Student.builder()
						.studentName("ajay")
						.age(18)
						.studentEmailId("ajay@gmail.com")
						.studentMobileNumber("1234567806")
						.guardian(Guardian.builder().name("peter").email("peter@gmail.com").mobileNumber("9876543226").build())
						.build(),
				Student.builder()
						.studentName("radhika")
						.age(19)
						.studentEmailId("radhika@gmail.com")
						.studentMobileNumber("1234567807")
						.guardian(Guardian.builder().name("quinn").email("quinn@gmail.com").mobileNumber("9876543227").build())
						.build(),
				Student.builder()
						.studentName("suresh")
						.age(21)
						.studentEmailId("suresh@gmail.com")
						.studentMobileNumber("1234567808")
						.guardian(Guardian.builder().name("richard").email("richard@gmail.com").mobileNumber("9876543228").build())
						.build(),
				Student.builder()
						.studentName("tanya")
						.age(22)
						.studentEmailId("tanya@gmail.com")
						.studentMobileNumber("1234567809")
						.guardian(Guardian.builder().name("sarah").email("sarah@gmail.com").mobileNumber("9876543229").build())
						.build()
		);

// Save all students to the database
		List<Student> savedStudents = studentRepository.saveAll(students);

		Student studentData = studentRepository.findById(saved.getStudentId()).orElse(null);


		assertNotNull(studentData);
		assertEquals("abi",studentData.getStudentName());






	}

}
