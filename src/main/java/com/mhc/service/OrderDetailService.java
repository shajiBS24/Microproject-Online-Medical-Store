package com.mhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhc.Repository.OrderDetailRepo;
import com.mhc.bean.OrderDetail;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailService {
	
	@Autowired
    private OrderDetailRepo repo;

    public List<OrderDetail> getAllOrderDetails() {
        return repo.findAll();
    }

//    public Optional<OrderDetail> getOrderDetailById(Long orderDetailId) {
//        return repo.findById(orderDetailId);
//    }
//
//    public OrderDetail createOrderDetail(OrderDetail orderDetail) {
//        return repo.save(orderDetail);
//    }
//
//    public OrderDetail updateOrderDetail(OrderDetail orderDetail) {
//        return repo.save(orderDetail);
//    }
//
//    public void deleteOrderDetail(Long orderDetailId) {
//    	repo.deleteById(orderDetailId);
//    }

}