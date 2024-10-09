package com.springDataJpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "student", uniqueConstraints = {
        @UniqueConstraint(name = "student_unique", columnNames = {"student_email_address", "student_mobile_number"}),
        @UniqueConstraint(name = "guardian_unique", columnNames = {"guardian_email_address", "guardian_mobile_number"})

})
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", allocationSize = 1, sequenceName = "student_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Integer studentId; // student_id

    private String studentName;

    private Integer age;

    @Column(name = "student_email_address", nullable = false, updatable = false)
    private String studentEmailId; // duplicate key

    @Column(name = "student_mobile_number", nullable = false, updatable = false)
    private String studentMobileNumber; // duplicate key

    @Embedded
    private Guardian guardian;

}
