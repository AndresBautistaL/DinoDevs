package com.epicmerch.fgm.services;

import java.util.ArrayList;
import static java.util.Collections.emptyList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.epicmerch.fgm.models.ClienteModel;
import com.epicmerch.fgm.repositories.ClienteRepository;

@Service
public class ClienteService implements UserDetailsService{

	@Autowired
	private  ClienteRepository clienteRepository;
	
	public ArrayList<ClienteModel> obtenerUsuario(){
		return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }
	
	//obtener usuario por id
	public ClienteModel obtenerUsuario(Long id) {
		Optional<ClienteModel> user = clienteRepository.findById(id);
		return user.orElse(null);
	}
	
	public ClienteModel guardarUsuario(ClienteModel usuario){
        return clienteRepository.save(usuario);
    }

	
	// eliminar
	public boolean eliminar(Long id) {
        try{
            clienteRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


	//actualizar
	public ClienteModel actualizar(ClienteModel usuarioModel) {
		return clienteRepository.save(usuarioModel);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		ClienteModel user = clienteRepository.findByCorreoElectronico(username);
		if(user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(user.getCorreoElectronico(), user.getContrasena(), emptyList());
	}

	}
	

