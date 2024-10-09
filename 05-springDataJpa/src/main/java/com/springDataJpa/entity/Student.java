package com.springDataJpa.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "students", uniqueConstraints = {@UniqueConstraint(
        name = "email_id_unique",
        columnNames = {"student_email_address", "guardian_email_address"}
), @UniqueConstraint(
        name = "mobile_number_unique",
        columnNames = {"student_mobile_number", "guardian_mobile_number"}
)})
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Integer studentId;

    private String studentFirstName;

    private String studentLastName;

    private String studentDOB;

    private Integer studentAge;

    @Column(name = "student_email_address", nullable = false, updatable = false)
    private String studentEmailId;

    @Column(name = "student_mobile_number", nullable = false, updatable = false)
    private String studentMobileNumber;

    @Embedded
    private Guardian guardian;
}
