package com.learning.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.learning.enums.OrderStatus;

@Entity
public class OrderEntity {

	@Id // for primary-key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	private Long id;
	private String name;
	private LocalDate date;
	private Double totalPrice;
	private Long productId;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	
	public OrderEntity() {
		
	}

	public OrderEntity(Long id, String name, LocalDate date, Double totalPrice, Long productId,
			OrderStatus orderStatus) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.totalPrice = totalPrice;
		this.productId = productId;
		this.orderStatus = orderStatus;
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

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProducttId(Long prodcutId) {
		this.productId = prodcutId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
}
