package com.epicmerch.fgm.controllers;

	import java.util.ArrayList;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.epicmerch.fgm.models.MetodoPagoModel;
	import com.epicmerch.fgm.services.MetodoPagoService;

	@RestController
	@RequestMapping("/metodopago")
	public class MetodoPagoController {

		//inyeccion por constructor del Bean que encripta
		
			private final MetodoPagoService metodoPagoService;
			@Autowired
			private final BCryptPasswordEncoder bCryptPasswordEncoder;
			public MetodoPagoController(@Autowired MetodoPagoService metodoPagoService, @Autowired BCryptPasswordEncoder bCryptPasswordEncoder) {
				this.metodoPagoService = metodoPagoService;
				this.bCryptPasswordEncoder = bCryptPasswordEncoder;
			}


		// obtener todos los posts
		@GetMapping() // http://localhost:8080/direccion
		public ArrayList<MetodoPagoModel> obtenerPago() {
			return metodoPagoService.obtenerPago();
		}

		@GetMapping("/{id}") // http://localhost:8080/direccion/1
		public MetodoPagoModel getDireccion(@PathVariable Long id) {
			return metodoPagoService.obtenerPago(id);
		}

		
		//Este es el método que encripta la información delicada
		@PostMapping() // http://localhost:8080/direccion
		public MetodoPagoModel guardarDireccion(@RequestBody MetodoPagoModel metodoPagoModel) {
			metodoPagoModel.setCvv(bCryptPasswordEncoder.encode(metodoPagoModel.getCvv()));
			metodoPagoModel.setNumeroDeTarjera(bCryptPasswordEncoder.encode(metodoPagoModel.getNumeroDeTarjera()));
			return metodoPagoService.guardarPago(metodoPagoModel);
		}

		
		
		// Editar usuario
		@PutMapping("/actualizar") // http://localhost:8080/direccion/actualizar
		public MetodoPagoModel update(@RequestBody MetodoPagoModel metodoPagoModel) {
			return metodoPagoService.actualizar(metodoPagoModel);
		}

		// Eliminar usuario
		@DeleteMapping("/eliminar/{id}") // http://localhost:8080/posts/eliminar/1
		public void eliminar(@PathVariable Long id) {
			metodoPagoService.eliminar(id);
		}


	    }
