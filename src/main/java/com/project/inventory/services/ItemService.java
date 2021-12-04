package com.project.inventory.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.inventory.entities.Item;
import com.project.inventory.entities.Items;

@Service
public interface ItemService {

	public List<Item> getItems();
}
