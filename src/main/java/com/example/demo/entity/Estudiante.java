package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="estudiantes")
public class Estudiante {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="est_id")
	private Long id;
	@Column(name="est_nombre")
	private String nombre;
	@Column(name="est_email")
	private String email;
	@ManyToMany(mappedBy="estudiantes")
	private List<Curso> cursos;
}

















































