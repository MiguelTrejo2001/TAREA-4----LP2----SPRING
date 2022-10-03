package com.example.demo.upeu.edu.pe.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.upeu.edu.pe.dao.Operaciones;
import com.example.demo.upeu.edu.pe.daoImpl.PersonaDaoImpl;
import com.example.demo.upeu.edu.pe.entity.Persona;
@Service
public class PersonaService implements Operaciones<Persona>{
	@Autowired
	private PersonaDaoImpl DaoImpl;

	@Override
	public int create(Persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Persona t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return DaoImpl.delete(id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> reaAll() {
		// TODO Auto-generated method stub
		return DaoImpl.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return DaoImpl.readAll2();
	}
	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return DaoImpl.readAll3();
	}

	@Override
	public List<Map<String, Object>> readAll4() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll5() {
		// TODO Auto-generated method stub
		return null;
	}

}
