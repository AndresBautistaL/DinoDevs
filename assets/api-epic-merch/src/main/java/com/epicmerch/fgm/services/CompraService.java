package com.epicmerch.fgm.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicmerch.fgm.models.CompraModel;
import com.epicmerch.fgm.repositories.CompraRepository;

@Service
public class CompraService {
	
	@Autowired
	private CompraRepository compraRepository;
	
	
	public ArrayList<CompraModel> obtenerCompra(){
		return (ArrayList<CompraModel>) compraRepository.findAll();
    }
	
	//obtener usuario por id
	public CompraModel obtenerCompra(Long id) {
			Optional<CompraModel> compra = compraRepository.findById(id);
			return compra.orElse(null);
		}
		
	public CompraModel guardarCompra(CompraModel CompraModel){
	        return compraRepository.save(CompraModel);
	    }
		
		// eliminar
		public void eliminar(Long id) {
			compraRepository.deleteById(id);	
		}

		//actualizar
		public CompraModel actualizar(CompraModel CompraModel) {
			return compraRepository.save(CompraModel);
		}
	
}
