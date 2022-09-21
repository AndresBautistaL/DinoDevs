package com.epicmerch.fgm.repositories;


public interface CompraRepository {
    public abstract CompraRepository findByCompra_Id(Long compra_id);
    public abstract CompraRepository findByAdquisicion_Id(Long adquisicion_id);
    public abstract CompraRepository findByCliente_Id(Long cliente_id);
    public abstract CompraRepository findByCantidadProductos(Integer cantidadProductos);
    public abstract CompraRepository findByEstatusEnvio(String estatusEnvio);
}
