package com.example.demo.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	private long id;
	private String nombre;
	private int duracion;
	private Profesor profesor;
	private List<Estudiante> estudiantes;
	
	
	
	
}






































