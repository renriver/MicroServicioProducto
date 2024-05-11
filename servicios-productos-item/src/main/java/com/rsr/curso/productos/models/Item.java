package com.rsr.curso.productos.models;

public class Item {
  //producto
 //cantidad
	private Producto producto;
	private Integer cantidad;
public Item() {	}
	public Item(Producto producto, Integer cantidad) {
		this.producto=producto;
		this.cantidad=cantidad;
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
	
	//total de pruducto ?
	public Double getTotal()
       {
		 return producto.getPrecio()*cantidad.doubleValue();
       }
	
}
