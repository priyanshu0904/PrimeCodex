package com.priyanshu.raj.LearningRESTAPIs.controller;

import com.priyanshu.raj.LearningRESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto();
    }
}