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
public class Controlador1 {
	
	@Autowired
	private Ivia intvService;
	@Autowired
	private IPpersona service;
	
	
	@GetMapping("/lista")
	public String lista(Model model) {
		List<via>vias=intvService.findAll();
		model.addAttribute("vias", vias);
		return "via";
	} 	
	@GetMapping("/news")
	public String agregar(Model model) {
		List<persona>personas= service.findAll();
		model.addAttribute("via",new via());
		model.addAttribute("personas", personas);
		return"formvia";
	}
	@PostMapping("/saves")
	public String saves(@Validated via v, Model model) {
		intvService.save(v);
		return"redirect:/lista";
		
	}
	@GetMapping("/edita/{id}")
	public String edita(@PathVariable("id")Integer id, Model model) {
		via via=intvService.findById(id).get();
		model.addAttribute("via", via);
		List<persona>personas= service.findAll();
		model.addAttribute("personas", personas);
		return"formvia";
	}
	@GetMapping("/elimina/{id}")
	public String delete(Model model, @PathVariable Integer id) {
		intvService.deleteById(id);
		return "redirect:/lista";	
	}

}
