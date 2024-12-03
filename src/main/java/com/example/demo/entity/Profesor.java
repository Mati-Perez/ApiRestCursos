package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="profesores")
public class Profesor {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prof_id")
	private Long id;
	@Column(name="prof_nombre")
	private String nombre;
	@Column(name="prof_especialidad")
	private String especialidad;
	@OneToMany(mappedBy="profesor", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Curso> cursos;
}
