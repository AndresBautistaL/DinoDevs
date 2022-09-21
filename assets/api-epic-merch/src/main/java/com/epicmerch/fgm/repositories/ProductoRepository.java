package com.epicmerch.fgm.repositories;

public interface ProductoRepository {
    public abstract ProductoRepository findByCategoria_producto(Long categoriaProducto);
    public abstract ProductoRepository findByColor(String color);

}
