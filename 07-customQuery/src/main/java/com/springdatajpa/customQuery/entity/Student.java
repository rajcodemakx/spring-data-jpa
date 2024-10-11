package com.springdatajpa.customQuery.entity;

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
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private Integer age;
    private String guardianEmailAddress;
    private String guardianMobileNumber;
    private String guardianName;
    private String studentEmailAddress;
    private String studentMobileNumber;
    private String studentName;
}
