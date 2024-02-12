package com.mhc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mhc.bean.Orders;
import com.mhc.service.OrderService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Orders>> getAllOrders() {
		List<Orders> orders = service.getAllOrders();
		return ResponseEntity.ok(orders);
	}
}