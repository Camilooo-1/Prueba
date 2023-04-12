package com.code.demo.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity

public class via {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String tipo;
	private String coc;
	private String numero;
	private int congestion;
	@ManyToOne
	@JoinColumn(name = "persona_id")
	private persona persona;
	
	
	public persona getPersona() {
		return persona;
	}

	public void setPersona(persona persona) {
		this.persona = persona;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCoc() {
		return coc;
	}

	public void setCoc(String coc) {
		this.coc = coc;
	}

	public int getCongestion() {
		return congestion;
	}

	public void setCongestion(int congestion) {
		this.congestion = congestion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public via() {
		super();
	}

	public via(Integer id, String tipo, String coc, String numero, int congestion, persona persona) {
		super();
		this.id = id;		
		this.tipo = tipo;
		this.coc = coc;
		this.numero = numero;
		this.congestion = congestion;
		this.persona = persona;
	}

	

	public via(Integer id) {
		super();
		this.id = id;
		
	}
	

	@Override
	public String toString() {
		return "via " + id + ", congestion: " + congestion;
	}
	
}
