package com.mhc.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhc.bean.Order;
import com.mhc.bean.User;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

	List<Order> findByUser(User currentUser);

}
