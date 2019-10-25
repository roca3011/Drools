package com.demo.tienda.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

import com.demo.tienda.model.Producto;

public class IntegracionPuntosExcelTest {

    private KieSession session;
    
	@Before
	public void setup() throws IOException{				
		session = new ReglasController().getKieSession();
	}
	
	@Test
	public void dadoUnProductoDeASeoObtieneLosPuntos() throws IOException {
		
		//arrange
		CalcularPuntos calcularPuntos2 = new CalcularPuntos(session);		
		Producto producto = new Producto();
		Producto productoEsperado = new Producto();
		producto.setTipoProducto("aseo");
		
		//act
		productoEsperado = calcularPuntos2.obtenerPuntos(producto);
		
		//assert
		assertEquals(15, productoEsperado.getPuntos());

	}
	

}
