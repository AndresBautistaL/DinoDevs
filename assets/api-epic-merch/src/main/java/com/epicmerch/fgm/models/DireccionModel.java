package com.epicmerch.fgm.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "direcciones")
public class DireccionModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "direccion_id", nullable = false)
	private Integer direccionId;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column(nullable = false)
	private String calle_numero;
	@Column(nullable = false)
	private String colonia;
	@Column(nullable = false)
	private String localidad;
	@Column(nullable = false)
	private String estado;
	@Column(nullable = false)
	private String pais;
	@Column(nullable = false)
	private String cp;
	@Column(nullable = false)
	private String telefono;
	@Column(nullable = false)
	private String referencias;
	
	@ManyToOne //se debe corresponder con el OneToMany en Clientes  
	@JoinColumn(nullable = false, name = "cliente_id")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private ClienteModel clienteDireccion; 

	/*
	 @JoinColumn(name = "cliente_id", foreignKey = @ForeignKey(name = "cliente_id", value =ConstraintMode.CONSTRAINT))
*/
	public Integer getDireccionId() {
		return direccionId;
	}

	public void setDireccionId(Integer direccionId) {
		this.direccionId = direccionId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCalle_numero() {
		return calle_numero;
	}

	public void setCalle_numero(String calle_numero) {
		this.calle_numero = calle_numero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public ClienteModel getClienteDireccion() {
		return clienteDireccion;
	}

	public void setClienteDireccion(ClienteModel clienteDireccion) {
		this.clienteDireccion = clienteDireccion;
	}

	
}
