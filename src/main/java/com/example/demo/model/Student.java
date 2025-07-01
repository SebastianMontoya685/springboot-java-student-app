package com.example.demo.model;

import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Please provide a valid email address")
    private String email;

    @NotBlank(message = "Course is required")
    private String course;
}