package com.epicmerch.fgm.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.epicmerch.fgm.models.ClientesModel;
import com.epicmerch.fgm.services.ClientesService;


@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	ClientesService usuarioService;
	
	//obtener todos los usuarios
	@GetMapping() // http://localhost:8080/usuario
	public ArrayList<ClientesModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuario();
    }
	
	@GetMapping("/{id}")  // http://localhost:8080/usuario/1
	public ClientesModel getProducto(@PathVariable Long id) {
		return usuarioService.obtenerUsuario(id);
	}
	
	//Buscar por prioridad   
	@GetMapping("/query")  // http://localhost:8080/usuario/query?prioridad=4
	public ArrayList<ClientesModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

	
	@PostMapping()  // http://localhost:8080/usuario
	public ClientesModel guardarUsuario(@RequestBody ClientesModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }

	// Editar usuario
	@PutMapping("/actualizar") //http://localhost:8080/usuario/actualizar
	public ClientesModel update(@RequestBody ClientesModel usuarioModel) {
		return usuarioService.actualizar(usuarioModel);
	}
	
	//Eliminar usuario
	@DeleteMapping("/eliminar/{id}") //http://localhost:8080/usuario/eliminar/1
		public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminar(id);
        if (ok){
            return "Se elimin� el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id " + id;
        }
    }
	
	

}
