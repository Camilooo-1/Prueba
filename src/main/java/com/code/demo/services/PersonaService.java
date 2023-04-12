package com.code.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.demo.interfaces.IPpersona;
import com.code.demo.modelo.persona;

@Service
public class PersonaService {

	
	@Autowired
	private IPpersona data;
	
	public List<persona> findAll(String palabraclave) {
		if(palabraclave !=null) {
			return data.findAll(palabraclave);
		}
		return data.findAll();
	}

	
	public Optional<persona> listarId(int id) {
		return data.findById(id);
	}

	
	public int save(persona p) {
		int res=0;
		persona persona=data.save(p);
		if(!persona.equals(null)){
			res=1;
		}
		return res;
	}

	
	public void delete(int id) {
		data.deleteById(id);
	}

}
