package com.example.demo.upeu.edu.pe.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.upeu.edu.pe.dao.Operaciones;
import com.example.demo.upeu.edu.pe.entity.Profesor;


@Component
public class ProfesorDaoImpl implements Operaciones<Profesor>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

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

	public List<Map<String, Object>> readAll4() {
        // TODO Auto-generated method stub
        String SQL = "select p.id_profesor as\"ID\", pe.nombre as \"NOMBRE\",concat(pe.apellido1 ,' , ', pe.apellido2) \"APELLIDOS\", d.nombre as \"Departamento\" \n"
                + "from profesor p inner join departamento d on \n"
                + "p.id_departamento = d.id inner join persona pe on \n"
                + "p.id_profesor = pe.id order by 1; ";
        return jdbcTemplate.queryForList(SQL);
    }

	@Override
	public List<Map<String, Object>> readAll5() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from persona\r\n"
				+ "WHERE telefono is NOT NULL\r\n"
				+ "order by 8;");
	
	}
	

}
