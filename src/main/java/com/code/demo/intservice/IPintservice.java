package com.code.demo.intservice;

import java.util.List;
import java.util.Optional;

import com.code.demo.modelo.persona;

public interface IPintservice {
	public List<persona>listar();
	public Optional<persona>listarId(int id);
	public int save(persona p);
	public void delete(int id);
	
}
