package com.project.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.inventory.entities.Item;
import com.project.inventory.services.ItemService;

@RestController
public class MyController {
	
	
	@Autowired
	private ItemService itemService;
	
	// This is only for Trial 
	@GetMapping("/home")
	public String home() {
		return "Welcome to RMgx Asset  Inventory";
	}
	
	
	//get the Inventory
	
	@GetMapping("/items")
	public List<Item> getItems()
	{
		return this.itemService.getItems();
		
		
		
	}
	
	
	
}
