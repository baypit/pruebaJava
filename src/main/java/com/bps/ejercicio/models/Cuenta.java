package com.bps.ejercicio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Entity
@Table(name = "cuenta")
public class Cuenta  {

    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
	
	@Column(name="CLIENTEID")
    private Integer clienteid;

	@Column(name="TIPO")
	private String tipo;
	
	@Column(name="DESCRIPCION")
	private String descripcion;   
        
    @Column(name="SALDO")
    private Double saldo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClienteid() {
		return clienteid;
	}

	public void setClienteid(Integer clienteid) {
		this.clienteid = clienteid;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
    
    
	     
}
