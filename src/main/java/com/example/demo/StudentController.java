package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api")
public class StudentController {
    @GetMapping("/students")
    public List<Student> getStudent(){
        return List.of(
            new Student(1,"anuraj","A"),
            new Student(2,"ramu","D"),
            new Student(3,"sethu","F")
        );
    }
}
