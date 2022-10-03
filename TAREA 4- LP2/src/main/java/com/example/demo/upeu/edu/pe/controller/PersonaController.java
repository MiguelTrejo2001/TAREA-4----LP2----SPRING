package com.example.demo.upeu.edu.pe.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.upeu.edu.pe.entity.Persona;
import com.example.demo.upeu.edu.pe.service.PersonaService;

@RestController
@RequestMapping("/api/alumno")
public class PersonaController {
	@Autowired
	private PersonaService perser;
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){
		return perser.readAll2();
	}
	@GetMapping("/all02")
	public List<Map<String, Object>> readAll3(){
		return perser.readAll3();
	}
	@GetMapping("/all3")
			    public List<Persona> realAll(){
			        return perser.reaAll();
			    }
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return perser.delete(id);
	}
}
