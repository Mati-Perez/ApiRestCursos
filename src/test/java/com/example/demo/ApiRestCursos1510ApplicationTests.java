package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Curso;
import com.example.demo.repository.ICursoRepository;

@SpringBootTest
class ApiRestCursos1510ApplicationTests {

	@Autowired
	private ICursoRepository cursoRepository;
	
	@Test
	void contextLoads() {
		List<Curso> cursos=cursoRepository.findByNombre("Java");
		//assertTrue(cursos.isEmpty());
	}

}



















































