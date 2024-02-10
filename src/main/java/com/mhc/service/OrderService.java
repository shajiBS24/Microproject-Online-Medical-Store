package com.mhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhc.Repository.OrderRepo;
import com.mhc.bean.Order;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

	@Autowired
	private OrderRepo repo;
	private UserService service;

	    public List<Order> getAllOrders() {
	        return repo.findAll();
	    }

//	    public Optional<Order> getOrderById(Long orderId) {
//	        return repo.findById(orderId);
//	    }
//
//	    public Order createOrder(Order order) {
//	        return repo.save(order);
//	    }
//
//	    public Order updateOrder(Order order) {
//	        return repo.save(order);
//	    }
//
//	    public void deleteOrder(Long orderId) {
//	    	repo.deleteById(orderId);
//	    }
//	    
//	    public Order placeOrder(Order order) {
//	    	return repo.save(order);
//	    }

}