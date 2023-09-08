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
@Table(name = "cliente")
public class Cliente {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CLIENTEID")
    private Integer id;

	@Column(name="CODIGO")
    private String codigo;
	
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="APELLIDO")
    private String apellido;
    
    @Column(name="EDAD")
    private int	edad;
    
     @Column(name="CUENTA")
    private String cuenta;

     @Column(name="EMPLEADO")
     private Boolean empleado;
     
     @Column(name="CARGO")
     private String cargo;
     
     public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Column(name="CREACION")
     private String fechaCreacion	;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public Boolean getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Boolean empleado) {
		this.empleado = empleado;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
     
	     
}
