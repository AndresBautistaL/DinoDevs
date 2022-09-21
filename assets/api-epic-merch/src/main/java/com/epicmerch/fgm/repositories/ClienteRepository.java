package com.epicmerch.fgm.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicmerch.fgm.models.ClienteModel;

@Repository
public interface ClienteRepository extends CrudRepository <ClienteModel, Integer> {
	public abstract ArrayList<ClienteModel> findById(Long cliente_id);

	public abstract ClienteModel findByNombre(String nombre);

	public abstract ClienteModel findByCorreo(String correo_electronico);
}
