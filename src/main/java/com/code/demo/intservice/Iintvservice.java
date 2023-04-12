package com.code.demo.intservice;

import java.util.List;
import java.util.Optional;

import com.code.demo.modelo.via;

public interface Iintvservice {
	public List<via>lista();
	public Optional<via>listaId(int id);
	public int saves(via v);
	public void delete(int id);
	public List<via> findAll();

}
