package com.example.demo.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {
	private Long id;
	private String nombre;
	private String especialidad;
	private List<Curso> cursos;
}
