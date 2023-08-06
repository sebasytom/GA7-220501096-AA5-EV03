package com.edu.sena.models.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "productos")
public class Producto {

	
	@Id
	@Column(name = "codigo")
	 private int codigo;
	
	 
	@Column(name = "precio")
	 private Float precio;
	
	@Column(name = "prenda") 
	 private String prenda;
	
	@Column(name = "cantidad") 
	 private int cantidad;
	
	@Column(name = "tela") 
	 private String tela;
	
	@Column(name = "color") 
	 private String color;
	
	@Column(name = "talla") 
	 private String talla;
	

	public Producto(int codigo, Float precio, String prenda, int cantidad, String tela, String color, String talla) {
		
		this.codigo = codigo;
		this.precio = precio;
		this.prenda = prenda;
		this.cantidad = cantidad;
		this.tela = tela;
		this.color = color;
		this.talla = talla;
	}

	public Producto() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getPrenda() {
		return prenda;
	}

	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}
	
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}
		
	
}
