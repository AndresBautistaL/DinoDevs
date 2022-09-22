package com.epicmerch.fgm.repositories;

import org.springframework.data.repository.CrudRepository;
import com.epicmerch.fgm.models.MetodoPagoModel;

public interface MetodoPagoRepository extends CrudRepository <MetodoPagoModel, Long>{
	public abstract MetodoPagoRepository findByClientePago (Long clientePago);
    public abstract MetodoPagoRepository findByFormaDePago(String formaDePago);
    public abstract MetodoPagoRepository findByEntidadFinanciera(String entiedadFinanciera);
    public abstract MetodoPagoRepository findByNombreTitular(String nombreTitular);
}
