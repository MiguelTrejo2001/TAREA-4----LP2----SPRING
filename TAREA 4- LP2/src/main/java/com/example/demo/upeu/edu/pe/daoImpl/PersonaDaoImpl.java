package com.example.demo.upeu.edu.pe.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.upeu.edu.pe.dao.Operaciones;
import com.example.demo.upeu.edu.pe.entity.Persona;
@Component
public class PersonaDaoImpl implements Operaciones<Persona>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

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
		return jdbcTemplate.update("DELETE FROM persona where id=?;",id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM persona", new BeanPropertyRowMapper<Persona>(Persona.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select CONCAT(p.nombre, ' ', p.apellido1) as Alumno,G.nombre AS GRADO, A.nombre as CURSO, p.sexo as SEXO from alumno_se_matricula_asignatura AL inner join asignatura A\r\n"
				+ "on AL.id_asignatura = A.id inner join grado G on A.id_grado = G.id inner join curso_escolar C on AL.id_curso_escolar = C.id inner join persona p on AL.id_alumno = p.id;");
	}
	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from Curso_escolar\r\n"
				+ "order by 2;");
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
