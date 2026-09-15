package com.priyanshu.raj.LearningRESTAPIs.service.impl;

import com.priyanshu.raj.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.priyanshu.raj.LearningRESTAPIs.dto.StudentDto;
import com.priyanshu.raj.LearningRESTAPIs.entity.Student;
import com.priyanshu.raj.LearningRESTAPIs.repository.StudentRepository;
import com.priyanshu.raj.LearningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student newStudent = modelMapper.map(addStudentRequestDto, Student.class);
        Student student = studentRepository.save(newStudent);
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students
                .stream()
                .map(student -> modelMapper.map(student, StudentDto.class))
                .toList();
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + id));
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public void deleteStudentById(Long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student not exists with id " + id);
        }
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto) {
        Student student = studentRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + id));
        modelMapper.map(addStudentRequestDto, student);
        student = studentRepository.save(student);
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto updatePartialStudent(Long id, Map<String, Object> updates) {
        Student student = studentRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found with id: " + id));
        updates.forEach((field, value) ->{
            switch (field){
                case "name" -> student.setName((String) value);
                case "email" ->  student.setEmail((String) value);
                default -> throw new IllegalArgumentException("Field is not supported");
            }
        });
        Student savedStudent = studentRepository.save(student);
        return modelMapper.map(savedStudent, StudentDto.class);
    }
}
