package com.rsr.curso.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rsr.curso.productos.models.Item;
import com.rsr.curso.productos.models.service.ItemService;

@RestController
public class ItemController {
   @Autowired
   @Qualifier("serviceFeing")
   
   private ItemService  itemService;
   @GetMapping("/listar")
   public List<Item> listar()
   {
	   return itemService.findAll();
   }
   @GetMapping("/ver/{id}/cantidad/{cantidad}") // llamar o invocar de forma estatica o dinamica
        //dinamica /{id}/{cantidad}
   public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad)
   {
	   return itemService.finById(id, cantidad);
   }
}
