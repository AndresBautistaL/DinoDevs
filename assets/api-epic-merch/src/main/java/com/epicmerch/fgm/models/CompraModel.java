package com.epicmerch.fgm.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "compras")
public class CompraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compra_id")
	private Long compraId;

    @Column(name = "cantidad_productos")
    private Integer cantidadProductos;

    @Column(name = "monto_total")
    private Double montoTotal;

    @Column(name = "estatus_envio")
    private String estatusEnvio;

    @ManyToOne
    @JoinColumn(nullable = false, name = "cliente_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY) 
    private ClienteModel clienteCompra;

    @ManyToMany
    @JoinTable(name = "adquisiciones",
        joinColumns = @JoinColumn( name = "compra_id"),
        inverseJoinColumns = @JoinColumn(name="producto_id"))
    private List<ProductoModel> productos = new ArrayList<>();

	public Long getCompraId() {
		return compraId;
	}

	public void setCompraId(Long compraId) {
		this.compraId = compraId;
	}

	public Integer getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(Integer cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getEstatusEnvio() {
		return estatusEnvio;
	}

	public void setEstatusEnvio(String estatusEnvio) {
		this.estatusEnvio = estatusEnvio;
	}



	public ClienteModel getClienteCompra() {
		return clienteCompra;
	}

	public void setClienteCompra(ClienteModel clienteCompra) {
		this.clienteCompra = clienteCompra;
	}

	public List<ProductoModel> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoModel> productos) {
		this.productos = productos;
	}

}
