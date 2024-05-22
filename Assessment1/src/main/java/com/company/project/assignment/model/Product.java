package com.company.project.assignment.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

	@Id
	private String id;
	private String name;
	private String[] details;
	private String ratings;
	private String imageUrl;
	private String isPromoExist;
	private String[] promoDetails;
	private String price;
	private String deliveryDistance;
	private String deliveryTime;

	public Product() {
		super();
	}

	public Product(String id, String name, String[] details, String ratings, String imageUrl, String isPromoExist,
			String[] promoDetails, String price, String deliveryDistance, String deliveryTime) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
		this.ratings = ratings;
		this.imageUrl = imageUrl;
		this.isPromoExist = isPromoExist;
		this.promoDetails = promoDetails;
		this.price = price;
		this.deliveryDistance = deliveryDistance;
		this.deliveryTime = deliveryTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getDetails() {
		return details;
	}

	public void setDetails(String[] details) {
		this.details = details;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getIsPromoExist() {
		return isPromoExist;
	}

	public void setIsPromoExist(String isPromoExist) {
		this.isPromoExist = isPromoExist;
	}

	public String[] getPromoDetails() {
		return promoDetails;
	}

	public void setPromoDetails(String[] promoDetails) {
		this.promoDetails = promoDetails;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDeliveryDistance() {
		return deliveryDistance;
	}

	public void setDeliveryDistance(String deliveryDistance) {
		this.deliveryDistance = deliveryDistance;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", details=" + Arrays.toString(details) + ", ratings=" + ratings
				+ ", imageUrl=" + imageUrl + ", isPromoExist=" + isPromoExist + ", promoDetails="
				+ Arrays.toString(promoDetails) + ", price=" + price + ", deliveryDistance=" + deliveryDistance
				+ ", deliveryTime=" + deliveryTime + "]";
	}

}