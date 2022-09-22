package com.epicmerch.fgm.repositories;

import org.springframework.data.repository.CrudRepository;
import com.epicmerch.fgm.models.CompraModel;

public interface CompraRepository extends CrudRepository <CompraModel, Long>{
	public abstract CompraRepository findByCompraId(Long compraId);
    //public abstract CompraRepository findByAdquisicion_Id(Long adquisicionId);
    public abstract CompraRepository findByClienteCompra(Long clienteCompra);
    public abstract CompraRepository findByCantidadProductos(Integer cantidadProductos);
    public abstract CompraRepository findByEstatusEnvio(String estatusEnvio);
}
