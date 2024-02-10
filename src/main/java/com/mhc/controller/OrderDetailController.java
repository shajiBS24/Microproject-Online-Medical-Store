package com.mhc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mhc.bean.OrderDetail;
import com.mhc.service.OrderDetailService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/orderdetails")
public class OrderDetailController {
	
	@Autowired
    private OrderDetailService service;

//    @GetMapping
//    public List<OrderDetail> getAllOrderDetails() {
//        return service.getAllOrderDetails();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<OrderDetail> getOrderDetailById(@PathVariable("id") Long orderDetailId) {
//        return service.getOrderDetailById(orderDetailId)
//                .map(orderDetail -> new ResponseEntity<>(orderDetail, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping
//    public ResponseEntity<OrderDetail> createOrderDetail(@RequestBody OrderDetail orderDetail) {
//        return new ResponseEntity<>(service.createOrderDetail(orderDetail), HttpStatus.CREATED);
//    }
//
////    @PutMapping("/{id}")
////    public ResponseEntity<OrderDetail> updateOrderDetail(@PathVariable("id") Long orderDetailId, @RequestBody OrderDetail orderDetail) {
////        orderDetail.setOrderDetailsId(orderDetailId);
////        return new ResponseEntity<>(service.updateOrderDetail(orderDetail), HttpStatus.OK);
////    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteOrderDetail(@PathVariable("id") Long orderDetailId) {
//    	service.deleteOrderDetail(orderDetailId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }

}