package com.epicmerch.fgm.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "direcciones")
public class DireccionesModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer direccion_id;
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
	
	// Llave for�nea
	@ManyToOne
	@JoinColumn(nullable = false, name = "direccion")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private ClientesModel clientes_id;

	public Integer getDireccion_id() {
		return direccion_id;
	}

	public void setDireccion_id(Integer direccion_id) {
		this.direccion_id = direccion_id;
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

	public ClientesModel getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(ClientesModel clientes_id) {
		this.clientes_id = clientes_id;
	}

	


}
