package com.auth.springse.controller;

import com.auth.springse.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> student = new ArrayList<>(List.of(
            new Student(1,"shashank",25),
            new Student(2,"adi",35)
    ));

    @GetMapping("/csrf")
    public CsrfToken getCSRFToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return student;

    }
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        this.student.add(student);

       return "Student added sucessfully";
    }

}
