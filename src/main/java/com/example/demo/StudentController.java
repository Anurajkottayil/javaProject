package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    public List<Student> students = new ArrayList<>(List.of(
            new Student(1, "anuraj", "A"),
            new Student(2, "ramu", "D"),
            new Student(3, "sethu", "F")));

    @GetMapping("/students")
    public List<Student> getStudent() {
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getSingleStudent(@PathVariable int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
