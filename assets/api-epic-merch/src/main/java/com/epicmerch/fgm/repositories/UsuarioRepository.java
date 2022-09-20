package com.epicmerch.fgm.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicmerch.fgm.models.ClientesModel;

@Repository
public interface UsuarioRepository extends CrudRepository<ClientesModel, Long> {
	public abstract ArrayList<ClientesModel> findByPrioridad(Integer prioridad);

	public abstract ClientesModel findByNombre(String username);
}
