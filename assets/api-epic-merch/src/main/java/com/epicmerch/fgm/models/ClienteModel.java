package com.epicmerch.fgm.models;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "clientes")
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id", nullable = false)
	private Long clienteId;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String apellido;
	

    @Column(name = "correo_electronico", nullable = false)
	private String correoElectronico;
	
	@Column(nullable = false)
	private String contrasena;

	//se debe corresponder a un ManyToOne y el mappedBy debe ser el nombre del objeto con JoinColumn
	@OneToMany(mappedBy = "clienteDireccion")
    private List<DireccionModel> direcciones;
	
	@OneToMany(mappedBy = "clienteCompra")
    private List<CompraModel> compras;
	
	@OneToMany(mappedBy = "clientePago")
    private List<MetodoPagoModel> metodoPago;

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
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

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
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

	public List<MetodoPagoModel> getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(List<MetodoPagoModel> metodoPago) {
		this.metodoPago = metodoPago;
	}



}
	
	
	
	
	