package com.code.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.demo.interfaces.Ivia;
import com.code.demo.intservice.Iintvservice;
import com.code.demo.modelo.via;

@Service
public class ViaService implements Iintvservice {

	
	@Autowired
	private Ivia data;
	@Override
	public List<via> lista() {
		return (List<via>)data.findAll();
	}

	@Override
	public Optional<via> listaId(int id) {
		return data.findById(id);
	}

	@Override
	public int saves(via v) {
		int res=0;
		via via=data.save(v);
		if(!via.equals(null)){
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public List<via> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
