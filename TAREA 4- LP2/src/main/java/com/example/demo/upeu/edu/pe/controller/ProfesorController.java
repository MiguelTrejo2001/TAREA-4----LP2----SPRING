package com.example.demo.upeu.edu.pe.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.upeu.edu.pe.service.ProfesorService;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
	@Autowired
	private ProfesorService perser;
	
	@GetMapping("/all4")
	public List<Map<String, Object>> readAll4(){
		return perser.readAll4();
	}
	@GetMapping("/all5")
	public List<Map<String, Object>> readAll5(){
		return perser.readAll5();
	}
	

}
