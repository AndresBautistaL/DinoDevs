package com.epicmerch.fgm.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "direccion")
public class DireccionModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String ciudad;

	@Column(nullable = false)
	private String pais;

	// Llave for�nea
	@OneToOne
	@JoinColumn(nullable = false, name = "usuario")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private ClientesModel usuario_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public ClientesModel getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(ClientesModel usuario_id) {
		this.usuario_id = usuario_id;
	}


}
