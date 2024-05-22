package com.company.project.assignment.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.assignment.model.Order;
import com.company.project.assignment.model.Product;
import com.company.project.assignment.service.AppService;

@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	AppService appService;

	public AppService getAppService() {
		return appService;
	}

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@GetMapping(value = "/orders/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> getOrderById(@PathVariable("id") String id) {
		Optional<Order> orderData = appService.getOrder(id);
		if (orderData.isPresent()) {
			return new ResponseEntity<>(orderData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/orders/{id}")
	public ResponseEntity<Order> updateOrder(@PathVariable("id") String id, @RequestBody Order order) {
		System.out.println("AppController.updateOrder()");
		Optional<Order> orderData = appService.updateOrder(order);
		if (orderData.isPresent()) {
			return new ResponseEntity<>(orderData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/orders/{id}")
	public ResponseEntity<String> removeOrder(@PathVariable("id") String id) {
		System.out.println("AppController.removeOrder()");
		boolean result = appService.deleteOrder(id);
		if (result) {
			return new ResponseEntity<>("Order Removed", HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(value = "/createdemo", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> createDemo(HttpServletRequest request) {
		try {
			System.out.println(request.getParameterMap().values());
			return new ResponseEntity<>(new Order(), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/orders", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> createOrder(@RequestBody Product product) {
		try {
			return new ResponseEntity<>(new Order(), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}