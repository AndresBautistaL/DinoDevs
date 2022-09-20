package com.epicmerch.fgm.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicmerch.fgm.models.DireccionModel;
import com.epicmerch.fgm.repositories.DireccionRepository;

@Service
public class DireccionService {
	
	@Autowired
	private DireccionRepository direccionRepository;
	
	
	public ArrayList<DireccionModel> obtenerDireccion(){
		return (ArrayList<DireccionModel>) direccionRepository.findAll();
    }
	
	//obtener usuario por id
	public DireccionModel obtenerDireccion(Integer id) {
		Optional<DireccionModel> direccion = direccionRepository.findById(id);
		return direccion.orElse(null);
	}
	
	public DireccionModel guardarDireccion(DireccionModel direccionModel){
        return direccionRepository.save(direccionModel);
    }

	
	// eliminar
	public void eliminar(Integer id) {
		direccionRepository.deleteById(id);	
	}

	//actualizar
	public DireccionModel actualizar(DireccionModel direccionModel) {
		return direccionRepository.save(direccionModel);
	}
}
