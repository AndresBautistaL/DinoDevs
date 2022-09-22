package com.epicmerch.fgm.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicmerch.fgm.models.MetodoPagoModel;
import com.epicmerch.fgm.repositories.MetodoPagoRepository;

@Service
public class MetodoPagoService{
	
	@Autowired
	private MetodoPagoRepository metodoPagoRepository;
	
	
	public ArrayList<MetodoPagoModel> obtenerPago(){
		return (ArrayList<MetodoPagoModel>) metodoPagoRepository.findAll();
    }
	
	//obtener usuario por id
	public MetodoPagoModel obtenerPago(Long id) {
			Optional<MetodoPagoModel> pago = metodoPagoRepository.findById(id);
			return pago.orElse(null);
		}
		
	public MetodoPagoModel guardarPago(MetodoPagoModel metodoPagoModel){
	        return metodoPagoRepository.save(metodoPagoModel);
	    }
		
		// eliminar
		public void eliminar(Long id) {
			metodoPagoRepository.deleteById(id);	
		}

		//actualizar
		public MetodoPagoModel actualizar(MetodoPagoModel metodoPagoModel) {
			return metodoPagoRepository.save(metodoPagoModel);
		}
	
}