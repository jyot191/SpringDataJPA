package com.Jyot.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jyot.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
