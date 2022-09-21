package com.epicmerch.fgm.models;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "clientes")
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long cliente_id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String apellido;
	
	@Column(nullable = false)
	private String correo_electronico;
	
	@Column(nullable = false)
	private String contrasena;

	//se debe corresponder a un ManyToOne y el mappedBy debe ser el nombre del objeto con JoinColumn
	@OneToMany(mappedBy = "cliente")
    private List<DireccionModel> direcciones;
	
	@OneToMany(mappedBy = "cliente")
    private List<CompraModel> compras;
	
	@OneToMany(mappedBy = "cliente")
    private List<MetodoPagoModel> metodosDePago;

	public Long getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
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

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public List<DireccionModel> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<DireccionModel> direcciones) {
		this.direcciones = direcciones;
	}

	public List<CompraModel> getCompras() {
		return compras;
	}

	public void setCompras(List<CompraModel> compras) {
		this.compras = compras;
	}

	public List<MetodoPagoModel> getMetodosDePago() {
		return metodosDePago;
	}

	public void setMetodosDePago(List<MetodoPagoModel> metodosDePago) {
		this.metodosDePago = metodosDePago;
	}

}
	
	
	
	
	