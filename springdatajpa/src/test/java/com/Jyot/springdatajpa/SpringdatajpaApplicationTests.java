package com.Jyot.springdatajpa;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Jyot.springdatajpa.entities.Student;
import com.Jyot.springdatajpa.repos.StudentRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Jyot");
		student.setTestScore(100);
		repository.save(student);
		
		Student savedStudent = repository.findById(1l).get();
        assertNotNull(savedStudent);
}
}
