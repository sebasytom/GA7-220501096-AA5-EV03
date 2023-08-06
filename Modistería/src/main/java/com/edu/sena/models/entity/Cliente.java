package com.edu.sena.models.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@Column(name = "codigo")
	 private int codigo;
	
	@Column(name = "nombre") 
	 private String nombre;
	 
	@Column(name = "apellido")
	 private String apellido;
	
	@Column(name = "direccion") 
	 private String direccion;
	
	@Column(name = "telefono") 
	 private String telefono;
	
	@Column(name = "talla") 
	 private String talla;
	
	@Column(name = "contraseña")
	 private String contraseña;
	 

	public Cliente(int codigo, String nombre, String apellido, String direccion, String telefono, String talla,
			String contraseña) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.talla = talla;
		this.contraseña = contraseña;
	}
	

	public Cliente() {
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	 
	 
	
}
