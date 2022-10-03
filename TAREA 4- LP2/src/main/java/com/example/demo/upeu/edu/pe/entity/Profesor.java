package com.example.demo.upeu.edu.pe.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
@AllArgsConstructor
public class Profesor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id_profesor;
	private int id_departamento;
	
	
	public int getId_profesor() {
		return id_profesor;
	}
	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
