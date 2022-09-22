package com.epicmerch.fgm.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicmerch.fgm.models.ClienteModel;

@Repository
public interface ClienteRepository extends CrudRepository <ClienteModel, Long> {
	public abstract ClienteModel findByNombre(String nombre);
	public abstract ClienteModel findByCorreoElectronico(String correoElectronico);
}
