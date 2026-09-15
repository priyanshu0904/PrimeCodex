package com.priyanshu.raj.LearningRESTAPIs.service;

import com.priyanshu.raj.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.priyanshu.raj.LearningRESTAPIs.dto.StudentDto;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Map;

public interface StudentService {
    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
