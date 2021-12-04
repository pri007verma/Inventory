package com.project.inventory.entities;

public class Item {
	private long id;
	private String title;
	private String designation;
	private String quantity;
	
	
	public Item(long id, String title, String designation, String quantity) {
		super();
		this.id = id;
		this.title = title;
		this.designation = designation;
		this.quantity = quantity;
	}


	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", designation=" + designation + ", quantity=" + quantity
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
