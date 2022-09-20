package com.epicmerch.fgm.services;

import java.util.ArrayList;
import static java.util.Collections.emptyList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.epicmerch.fgm.models.ClientesModel;
import com.epicmerch.fgm.repositories.UsuarioRepository;

@Service
public class ClientesService implements UserDetailsService{

	@Autowired
	private  UsuarioRepository usuarioRepository;
	
	public ArrayList<ClientesModel> obtenerUsuario(){
		return (ArrayList<ClientesModel>) usuarioRepository.findAll();
    }
	
	//obtener usuario por id
	public ClientesModel obtenerUsuario(Long id) {
		Optional<ClientesModel> user = usuarioRepository.findById(id);
		return user.orElse(null);
	}
	
	public ClientesModel guardarUsuario(ClientesModel usuario){
        return usuarioRepository.save(usuario);
    }

	
	// eliminar
	public boolean eliminar(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


	//actualizar
	public ClientesModel actualizar(ClientesModel usuarioModel) {
		return usuarioRepository.save(usuarioModel);
	}
	
	//buscar por prioridad
	public ArrayList<ClientesModel> obtenerPorPrioridad(Integer prioridad) {
		return usuarioRepository.findByPrioridad(prioridad);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		ClientesModel user = usuarioRepository.findByNombre(username);
		if(user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(user.getNombre(), user.getPassword(), emptyList());
	}

	}
	

