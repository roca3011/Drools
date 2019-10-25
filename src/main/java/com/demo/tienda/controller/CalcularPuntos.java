/**
 * 
 */
package com.demo.tienda.controller;

import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.demo.tienda.model.Producto;

/**
 * @author robecafr
 *
 */
@Component
public class CalcularPuntos {	

	@Autowired
	private KieSession session;
	
	public CalcularPuntos() {
	}
	
	public CalcularPuntos(KieSession session) {
		this.session = session;
	}
	
	public Producto obtenerPuntos(Producto producto) {
		session.insert(producto);
		session.fireAllRules();
		//session.dispose ();  //liberar recursos
		return producto;
	}

}
