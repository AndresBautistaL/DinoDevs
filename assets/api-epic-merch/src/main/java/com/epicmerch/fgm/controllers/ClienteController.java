package com.epicmerch.fgm.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.epicmerch.fgm.models.ClienteModel;
import com.epicmerch.fgm.services.ClienteService;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
		
		//inyeccion por constructor
	
		private final ClienteService clienteService;
		@Autowired
		private final BCryptPasswordEncoder bCryptPasswordEncoder;
		public ClienteController(@Autowired ClienteService clienteService, @Autowired BCryptPasswordEncoder bCryptPasswordEncoder) {
			this.clienteService = clienteService;
			this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		}
	
	//obtener todos los usuarios
	@GetMapping() // http://localhost:8080/usuario
	public ArrayList<ClienteModel> obtenerUsuarios(){
        return clienteService.obtenerUsuario();
    }
	
	@GetMapping("/{id}")  // http://localhost:8080/usuario/1
	public ClienteModel getProducto(@PathVariable Long id) {
		return clienteService.obtenerUsuario(id);
	}
	
	@PostMapping()  // http://localhost:8080/usuario
	public ClienteModel guardarUsuario(@RequestBody ClienteModel usuario){
		usuario.setContrasena(bCryptPasswordEncoder.encode(usuario.getContrasena()));
        return clienteService.guardarUsuario(usuario);
    }

	// Editar usuario
	@PutMapping("/actualizar") //http://localhost:8080/usuario/actualizar
	public ClienteModel update(@RequestBody ClienteModel usuarioModel) {
		return clienteService.actualizar(usuarioModel);
	}
	
	//Eliminar usuario
	@DeleteMapping("/eliminar/{id}") //http://localhost:8080/usuario/eliminar/1
		public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.clienteService.eliminar(id);
        if (ok){
            return "Se elimino el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id " + id;
        }
    }
	
	

}
