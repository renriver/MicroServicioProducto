package com.rsr.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.rsr.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
