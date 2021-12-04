package com.project.inventory.services;

import java.util.ArrayList;
import java.util.List;

import com.project.inventory.entities.Item;

public class ItemServiceImpl implements ItemService{

	List<Item> list;
	public ItemServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Item(111,"employee","core java","three"));
		list.add(new Item(112,"furniture","table","four"));
	}
	
	
	
	
	@Override
	public List<Item> getItems() {
	
		return null;
	}

}
