package com.company.project.assignment.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {

	@Id
	public String id;
	public String userId;
	public List<Product> products;
	private String totalPrice;
	private String status;
	private String createdAt;

	public Order() {
		super();
	}

	public Order(String id, String userId, List<Product> products, String totalPrice, String status, String createdAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.products = products;
		this.totalPrice = totalPrice;
		this.status = status;
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", products=" + products + ", totalPrice=" + totalPrice
				+ ", status=" + status + ", createdAt=" + createdAt + "]";
	}

}