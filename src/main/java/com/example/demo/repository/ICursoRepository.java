package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Curso;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {

	List<Curso> findByNombre(String nombre);
}
