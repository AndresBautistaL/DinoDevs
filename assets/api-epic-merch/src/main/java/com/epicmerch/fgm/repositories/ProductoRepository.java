package com.epicmerch.fgm.repositories;

import org.springframework.data.repository.CrudRepository;
import com.epicmerch.fgm.models.ProductoModel;

public interface ProductoRepository extends CrudRepository <ProductoModel, Long>{
	public abstract ProductoRepository findByCategoriaProducto(Long categoriaProducto);
    public abstract ProductoRepository findByColor(String color);
    public abstract ProductoRepository findByImagen(String imagen);
}
