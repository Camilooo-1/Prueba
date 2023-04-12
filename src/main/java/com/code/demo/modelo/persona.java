package com.code.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity

public class persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	 
	private String expe;
	private String codigoSecretaria;

	@ManyToOne
	@JoinColumn(name = "via_id")
	private via via;

	public persona(Integer id, String nombre, String expe, String codigoSecretaria, via via) {
		super();
		this.id = id;
		this.nombre = nombre;
		
		this.expe = expe;
		this.codigoSecretaria = codigoSecretaria;
		this.via = via;
	}

	public persona(String nombre, String expe, String codigoSecretaria, via via) {
		super();
		this.nombre = nombre;
		
		this.expe = expe;
		this.codigoSecretaria = codigoSecretaria;
		this.via = via;
	}

	public persona(Integer id) {
		super();
		this.id = id;
	}

	public persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public persona() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getExpe() {
		return expe;
	}

	public void setExpe(String expe) {
		this.expe = expe;
	}

	public String getCodigoSecretaria() {
		return codigoSecretaria;
	}

	public void setCodigoSecretaria(String codigoSecretaria) {
		this.codigoSecretaria = codigoSecretaria;
	}

	public via getVia() {
		return via;
	}

	public void setVia(via via) {
		this.via = via;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
