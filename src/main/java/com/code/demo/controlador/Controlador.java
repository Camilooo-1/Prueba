package com.code.demo.controlador;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.code.demo.interfaces.IPpersona;
import com.code.demo.interfaces.Ivia;

import com.code.demo.modelo.persona;
import com.code.demo.modelo.via;



@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IPpersona service;
	@Autowired
	private Ivia intvService;
	
	@RequestMapping("/listar")
	public String listar(Model modelo) {
		List<persona>personas= service.findAll();
		modelo.addAttribute("personas", personas);	
		
		return "index";
	} 	
	@RequestMapping("/listarid")
	public String lista(Model modelo) {
		String palabraclave="3";
		List<persona>personas= service.findAll(palabraclave);
		modelo.addAttribute("personas", personas);	
			
		
		return "index";
	} 	
	@GetMapping("/volver")
		public String String () {
			return"pantalla";
		
	}
	@GetMapping("/new")
	public String agregar(Model modelo) {
		List<via>vias=intvService.findAll();
		
		modelo.addAttribute("persona",new persona());
		modelo.addAttribute("vias", vias);
		return"form";
	}
	@PostMapping("/save")
	public String save(@Validated persona p, Model model) {
		service.save(p);
		return"redirect:/listar";
		
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") Integer id, Model model) {
		persona persona=service.findById(id).get();
		model.addAttribute("persona", persona);
		List<via>vias=intvService.findAll();
		
		
		model.addAttribute("vias", vias);
		return"form";
	}
	@GetMapping("/eliminar/{id}")
	public String delete(@PathVariable("id")Integer id, Model modelo) {
		service.deleteById(id);
		return "redirect:/listar";	
	}

}
