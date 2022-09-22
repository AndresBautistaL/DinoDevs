package com.epicmerch.fgm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicmerch.fgm.models.DireccionModel;

@Repository
public interface DireccionRepository extends CrudRepository<DireccionModel, Integer> {
	public abstract DireccionModel findByDireccionId(Long direccionId);
    public abstract DireccionModel findByEstado(String estado);
    public abstract DireccionModel findByNombre(String nombre);
    public abstract DireccionModel findByCp(String cp);
    public abstract DireccionModel findByTelefono(String telefono);
}
