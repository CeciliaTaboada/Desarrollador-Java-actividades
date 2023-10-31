package com.curso.compras.models;

public class ItemCarrito {
	
	private Producto producto;
	private Integer cantidad;
	
	public ItemCarrito(Producto producto, Integer cantidad) {
		this.setProducto(producto);
		this.setCantidad(cantidad);
	}
	
	public double getPrecio() {
		return this.producto.getPrecio()*this.getCantidad();
	}
	
	public String toString() {
		return this.getProducto().getNombre()+"("+this.getCantidad()+")";
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
