package com.epicmerch.fgm.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class ProductoModel {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "categoria_producto")
    private String categoriaProducto;

    @Column(name = "talla_c")
    private Integer tallaC;

    @Column(name = "talla_m")
    private Integer tallaM;

    @Column(name = "talla_g")
    private Integer tallaG;

    @Column(name = "talla_xg")
    private Integer tallaXG;

    @Column(name = "color")
    private String color;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "imagen")
    private String imagen;

    @ManyToMany(mappedBy = "productos")
    private List<CompraModel> compras = new ArrayList<>();
    
    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public Integer getTallaC() {
        return tallaC;
    }
    
    public void setTallaC(Integer tallaC) {
        this.tallaC = tallaC;
    }

    public Integer getTallaM() {
        return tallaM;
    }

    public void setTallaM(Integer tallaM) {
        this.tallaM = tallaM;
    }

    public Integer getTallaG() {
        return tallaG;
    }

    public void setTallaG(Integer tallaG) {
        this.tallaG = tallaG;
    }

    public Integer getTallaXG() {
        return tallaXG;
    }

    public void setTallaXG(Integer tallaXG) {
        this.tallaXG = tallaXG;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

   

    public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<CompraModel> getCompras() {
        return compras;
    }

    public void setCompras(List<CompraModel> compras) {
        this.compras = compras;
    }

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
