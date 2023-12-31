package com.curso.compras.models;

public class Carrito {
	
	private Persona persona;
	private ItemCarrito item1;
	private ItemCarrito item2;
	private ItemCarrito item3;
	

	public Carrito(Persona persona) {
		this.setPersona(persona);
	}
	
	public Carrito(Persona persona, ItemCarrito item1, ItemCarrito item2, ItemCarrito item3) {
		this.setPersona(persona);
		this.setItem1(item1);
		this.setItem2(item2);
		this.setItem3(item3);
	}
	
	public Double getCostoFinal() {
		Double costoFinal = 0.0; // variable de acumulacion
		costoFinal = this.item1.getPrecio()+this.item2.getPrecio()+this.item3.getPrecio();
		return costoFinal;
	}
	
	public Double getCostoFinal(Descuento descuento) {
		return descuento.valorFinal(this.getCostoFinal());
	}
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	

	public ItemCarrito getItem1() {
		return item1;
	}

	public void setItem1(ItemCarrito item1) {
		this.item1 = item1;
	}

	public ItemCarrito getItem2() {
		return item2;
	}

	public void setItem2(ItemCarrito item2) {
		this.item2 = item2;
	}

	public ItemCarrito getItem3() {
		return item3;
	}

	public void setItem3(ItemCarrito item3) {
		this.item3 = item3;
	}
	
	

}
