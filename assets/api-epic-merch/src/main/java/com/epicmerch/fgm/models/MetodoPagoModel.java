package com.epicmerch.fgm.models;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "metodos_de_pago")
public class MetodoPagoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long metodoPagoId;

    @Column(name = "forma_de_pago")
    private String formaDePago;
    
    @Column(name = "entidad_financiera")
    private String entidadFinanciera;

    @Column(name = "nombre_titular")
    private String nombreTitular;

    @Column(name = "numero_de_tarjeta")
    private String numeroDeTarjera;

    @Column(name = "mes_tarjeta")
    private String mesTarjeta;

    @Column(name = "anio_tarjeta")
    private String anioTarjeta;

    @Column(name = "cvv")
    private String cvv;

  /*  @ManyToOne
    @JoinColumn(nullable = false, name = "cliente_id")
    private ClienteModel clientePago;*/
    
    @ManyToOne
    @JoinColumn(nullable = false, name = "cliente_id")
    @JsonProperty(access = Access.WRITE_ONLY)
    private ClienteModel clientePago;

	public Long getMetodoPagoId() {
		return metodoPagoId;
	}

	public void setMetodoPagoId(Long metodoPagoId) {
		this.metodoPagoId = metodoPagoId;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	public String getEntidadFinanciera() {
		return entidadFinanciera;
	}

	public void setEntidadFinanciera(String entidadFinanciera) {
		this.entidadFinanciera = entidadFinanciera;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getNumeroDeTarjera() {
		return numeroDeTarjera;
	}

	public void setNumeroDeTarjera(String numeroDeTarjera) {
		this.numeroDeTarjera = numeroDeTarjera;
	}

	public String getMesTarjeta() {
		return mesTarjeta;
	}

	public void setMesTarjeta(String mesTarjeta) {
		this.mesTarjeta = mesTarjeta;
	}

	public String getAnioTarjeta() {
		return anioTarjeta;
	}

	public void setAnioTarjeta(String anioTarjeta) {
		this.anioTarjeta = anioTarjeta;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public ClienteModel getClientePago() {
		return clientePago;
	}

	public void setClientePago(ClienteModel clientePago) {
		this.clientePago = clientePago;
	}


}
