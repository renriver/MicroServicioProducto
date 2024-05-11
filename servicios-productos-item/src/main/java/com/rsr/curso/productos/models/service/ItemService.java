package com.rsr.curso.productos.models.service;

import java.util.List;

import com.rsr.curso.productos.models.Item;

public interface ItemService {
  public List <Item> findAll();
  public Item finById(Long id, Integer cantidad);
}
