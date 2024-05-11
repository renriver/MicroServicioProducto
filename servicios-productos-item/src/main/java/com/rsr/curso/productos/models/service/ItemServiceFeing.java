package com.rsr.curso.productos.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.rsr.curso.productos.clientes.ProductoClienteRest;
import com.rsr.curso.productos.models.Item;

@Service("serviceFeing")
@Primary
public class ItemServiceFeing implements ItemService {

	@Autowired
	private ProductoClienteRest clienteFeign;
	
	@Override
	public List<Item> findAll() {
		
		return clienteFeign.listar().stream().map(p->new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item finById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return new Item(clienteFeign.datalle(id), cantidad);
	}

}
