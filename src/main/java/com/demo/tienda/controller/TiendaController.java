/**
 * 
 */
package com.demo.tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.tienda.model.Producto;

/**
 * @author robecafr
 *
 */
@RestController
public class TiendaController {
	
	@Autowired
	private CalcularPuntos calcularPuntos;
	
	@PostMapping("/puntos")
	public Producto puntosPorProducto(@RequestBody Producto producto) {
		return calcularPuntos.obtenerPuntos(producto);
	}
	
	@GetMapping("/prueba")
	private String test() {
		return "Test";

	}

}
