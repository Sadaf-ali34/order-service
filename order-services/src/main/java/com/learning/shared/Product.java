package com.learning.shared;

import java.time.LocalDate;
import java.time.LocalTime;

public class Product {

	private Long id;
	private String name;
	private LocalDate date;
	private LocalTime time;
	private Category category;
	
	public Product() {
		
	}
	
	public Product(Long id, String name, LocalDate date, LocalTime time, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.category = category;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
}
