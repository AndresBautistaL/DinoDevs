package com.epicmerch.fgm.repositories;

public interface MetodoPagoRepository {
    public abstract MetodoPagoRepository findByCliente_id (Long cliente_id);
    public abstract MetodoPagoRepository findByForma_Pago(String formaDePago);
    public abstract MetodoPagoRepository findByEntidad_financiera(String entiedadFinanciera);
    public abstract MetodoPagoRepository findByNombre_titular(String nombreTitular);
}
