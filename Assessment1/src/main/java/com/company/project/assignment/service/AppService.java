package com.company.project.assignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.assignment.model.Order;
import com.company.project.assignment.model.Product;
import com.company.project.assignment.repository.OrderRepository;
import com.company.project.assignment.repository.ProductRepository;
import com.company.project.assignment.repository.UserRepository;

@Service
public class AppService {

	@Autowired
	ProductRepository productRepo;

	@Autowired
	OrderRepository orderRepo;

	@Autowired
	UserRepository userRepo;

	public ProductRepository getProductRepo() {
		return productRepo;
	}

	public void setProductRepo(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}

	public OrderRepository getOrderRepo() {
		return orderRepo;
	}

	public void setOrderRepo(OrderRepository orderRepo) {
		this.orderRepo = orderRepo;
	}

	public UserRepository getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public Optional<Order> getOrder(String id) {
		Optional<Order> order = null;
		if (id == null) {
			order = orderRepo.findById(id);
		}
		return order;
	}

	public Optional<Order> updateOrder(Order order) {
		Optional<Order> ordr = getOrder(order.getId());
		if (ordr.isPresent()) {
			Order ord = ordr.get();
			ord.setCreatedAt(order.getCreatedAt());
			ord.setStatus(order.getStatus());
			ord.setTotalPrice(order.getTotalPrice());
			// ord.setProducts(products);
		}
		return ordr;
	}

	public boolean deleteOrder(String id) {
		try {
			orderRepo.deleteById(id);
			return true;
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return false;
	}

	public Optional<Order> createOrder(Product product) {
		Optional<Order> order = orderRepo.save(product);
		return order;
	}
}
