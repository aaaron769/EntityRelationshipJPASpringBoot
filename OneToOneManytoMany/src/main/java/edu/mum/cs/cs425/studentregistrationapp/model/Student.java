package edu.mum.cs.cs425.studentregistrationapp.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId ;
    @Column(name="student_number")
    private Long studentNumber;
    private String name;
    private float cgpa;
    private LocalDate admissionDate;
    // one to one relation ship with Transcript



}
