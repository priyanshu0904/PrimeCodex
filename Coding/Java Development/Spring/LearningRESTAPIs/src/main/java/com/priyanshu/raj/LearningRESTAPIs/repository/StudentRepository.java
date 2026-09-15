package com.priyanshu.raj.LearningRESTAPIs.repository;

import com.priyanshu.raj.LearningRESTAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
