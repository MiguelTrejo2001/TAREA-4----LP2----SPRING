package com.example.demo.upeu.edu.pe.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.upeu.edu.pe.dao.Operaciones;
import com.example.demo.upeu.edu.pe.daoImpl.ProfesorDaoImpl;
import com.example.demo.upeu.edu.pe.entity.Profesor;

@Service
public class ProfesorService implements Operaciones<Profesor>{
	@Autowired
	private ProfesorDaoImpl  DaoImpl;

	@Override
	public int create(Profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Profesor t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Profesor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesor> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll4() {
		// TODO Auto-generated method stub
		return DaoImpl.readAll4();
	}

	@Override
	public List<Map<String, Object>> readAll5() {
		// TODO Auto-generated method stub
		return DaoImpl.readAll5();
	}
	
	

}
