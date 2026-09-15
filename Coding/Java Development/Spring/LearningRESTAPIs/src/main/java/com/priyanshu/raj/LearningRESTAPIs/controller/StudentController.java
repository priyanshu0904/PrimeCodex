package com.priyanshu.raj.LearningRESTAPIs.controller;

import com.priyanshu.raj.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.priyanshu.raj.LearningRESTAPIs.dto.StudentDto;
import com.priyanshu.raj.LearningRESTAPIs.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    }

//    @GetMapping("/students/{id}/{name}")
//    public String getStudentsById(@PathVariable Long id, @PathVariable String name) {
//        return "Path Variable " + id + " name is " + name;
//    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentsById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id,
                                                    @RequestBody @Valid AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.ok(studentService.updateStudent(id, addStudentRequestDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updatePartialStudent(@PathVariable Long id,
                                                           @RequestBody Map<String, Object> updates){
        return ResponseEntity.ok(studentService.updatePartialStudent(id, updates));
    }
}