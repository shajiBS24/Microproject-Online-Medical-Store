package com.mhc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhc.bean.Medicine;
import com.mhc.service.CartService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/carts")
public class CartController {

	@Autowired
	private CartService service;

	@GetMapping
	public List<Medicine> getAllMedicines() {
		return service.getAllMedicines();
	}

	@PostMapping("/add")
	public ResponseEntity<String> addToCart(@RequestBody Medicine medicine) {
		service.addToCart(medicine);
		return ResponseEntity.ok("Medicine added to cart successfully");
	}

}
