/**
 * 
 */
package com.demo.tienda.model;

/**
 * @author robecafr
 *
 */
public class Producto {
	
	private String nombreProducto;
	private String tipoProducto;
	private long precioProducto;
	private int puntos;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public long getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(long precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
