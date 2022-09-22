package com.epicmerch.fgm.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicmerch.fgm.models.CompraModel;
import com.epicmerch.fgm.services.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	

	@Autowired
	private CompraService compraService;

	// obtener todos los posts
	@GetMapping() // http://localhost:8080/direccion
	public ArrayList<CompraModel> obtenerCompra() {
		return compraService.obtenerCompra();
	}

	@GetMapping("/{id}") // http://localhost:8080/direccion/1
	public CompraModel getDireccion(@PathVariable Long id) {
		return compraService.obtenerCompra(id);
	}

	@PostMapping() // http://localhost:8080/direccion
	public CompraModel guardarDireccion(@RequestBody CompraModel CompraModel) {
		return compraService.guardarCompra(CompraModel);
	}

	// Editar usuario
	@PutMapping("/actualizar") // http://localhost:8080/direccion/actualizar
	public CompraModel update(@RequestBody CompraModel compraModel) {
		return compraService.actualizar(compraModel);
	}

	// Eliminar usuario
	@DeleteMapping("/eliminar/{id}") // http://localhost:8080/posts/eliminar/1
	public void eliminar(@PathVariable Long id) {
		compraService.eliminar(id);
	}


}
