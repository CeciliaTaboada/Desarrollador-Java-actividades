package com.curso.compras.models;

import java.time.LocalDate;

public class Producto {
	
	private String nombre;
	private String descripcion;
	private LocalDate fechaAlta;
	private Integer pesoKG;
	private Double precio;
	private Integer stock;
	
	//Estatico y final, es constante, no se puede modificar
	private static final Double minPrecio = 0.1;
	private static final Integer minStock = 10;
	
	public Producto(String nombre) {
		this.setNombre(nombre);
		this.setFechaAlta(LocalDate.now());
		this.setPrecio(minPrecio);
		this.setStock(minStock);
	}
	
	public Producto(String nombre, Double precio) {
		this.setNombre(nombre);
		this.setFechaAlta(LocalDate.now());
		this.setPrecio(precio);
		this.setStock(minStock);
	}
	
	public Producto(String nombre, String descripcion, Integer pesoKG, Double precio) {
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setFechaAlta(LocalDate.now());
		this.setPesoKG(pesoKG);
		this.setPrecio(precio);
		this.setStock(minStock);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Integer getPesoKG() {
		return pesoKG;
	}
	public void setPesoKG(Integer pesoKG) {
		this.pesoKG = pesoKG;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public static Double getMinprecio() {
		return minPrecio;
	}
	public static Integer getMinstock() {
		return minStock;
	}
	
	

}
