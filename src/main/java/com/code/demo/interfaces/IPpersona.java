package com.code.demo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.code.demo.modelo.persona;


public interface IPpersona extends JpaRepository<persona, Integer>{
	
	@Query("SELECT p FROM persona p WHERE"
			+ " CONCAT(p.id, p.nombre)"
			+ " LIKE %?1%")


	public List<persona> findAll(String palabraClave);
		
	
}
