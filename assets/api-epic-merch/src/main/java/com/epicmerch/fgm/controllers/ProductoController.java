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

import com.epicmerch.fgm.models.ProductoModel;
import com.epicmerch.fgm.services.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private ProductoService productoService;

	// obtener todos los posts
	@GetMapping() // http://localhost:8080/direccion
	public ArrayList<ProductoModel> obtenerProducto() {
		return productoService.obtenerProducto();
	}

	@GetMapping("/{id}") // http://localhost:8080/direccion/1
	public ProductoModel getDireccion(@PathVariable Long id) {
		return productoService.obtenerProducto(id);
	}

	@PostMapping() // http://localhost:8080/direccion
	public ProductoModel guardarDireccion(@RequestBody ProductoModel ProductoModel) {
		return productoService.guardarProducto(ProductoModel);
	}

	// Editar usuario
	@PutMapping("/actualizar") // http://localhost:8080/direccion/actualizar
	public ProductoModel update(@RequestBody ProductoModel productoModel) {
		return productoService.actualizar(productoModel);
	}

	// Eliminar usuario
	@DeleteMapping("/eliminar/{id}") // http://localhost:8080/posts/eliminar/1
	public void eliminar(@PathVariable Long id) {
		productoService.eliminar(id);
	}
}
