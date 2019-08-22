package com.example.spring.respository;

import com.example.spring.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
}