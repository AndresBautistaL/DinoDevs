package com.epicmerch.fgm.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicmerch.fgm.models.ProductoModel;
import com.epicmerch.fgm.repositories.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	
	public ArrayList<ProductoModel> obtenerProducto(){
		return (ArrayList<ProductoModel>) productoRepository.findAll();
    }
	
	//obtener usuario por id
	public ProductoModel obtenerProducto(Long id) {
			Optional<ProductoModel> producto = productoRepository.findById(id);
			return producto.orElse(null);
		}
		
	public ProductoModel guardarProducto(ProductoModel ProductoModel){
	        return productoRepository.save(ProductoModel);
	    }
		
		// eliminar
		public void eliminar(Long id) {
			productoRepository.deleteById(id);	
		}

		//actualizar
		public ProductoModel actualizar(ProductoModel ProductoModel) {
			return productoRepository.save(ProductoModel);
		}
}
