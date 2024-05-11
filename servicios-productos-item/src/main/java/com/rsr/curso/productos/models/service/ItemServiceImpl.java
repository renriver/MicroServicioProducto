package com.rsr.curso.productos.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rsr.curso.productos.models.Item;
import com.rsr.curso.productos.models.Producto;

@Service("serviceRestTemplate")
public class ItemServiceImpl implements ItemService {
	@Autowired
	private RestTemplate clientRest;
	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		List<Producto> productos=Arrays.asList(clientRest.getForObject("http://localhost:8001/listar", Producto[].class));//url servicio a consumir 
		 return productos.stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item finById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		Map<String, String> pathVariables= new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Producto producto= clientRest.getForObject("http://localhost:8001/ver/{id}", Producto.class,pathVariables);
		return new  Item (producto,cantidad);
	}

}
