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
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId; // student_id

    private String studentName;

    @Column(name = "student_email_address", nullable = false)
    private String studentEmailId;

    private Integer studentAge;

    private String guardianName;
    @Column(name = "guardian_email_address", nullable = false)
    private String guardianEmailId;

    @Column(name = "contact", nullable = false)
    private String guardianMobile;
}
