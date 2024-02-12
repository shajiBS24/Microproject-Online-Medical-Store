package com.mhc;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import com.mhc.bean.Medicine;
import com.mhc.bean.Orders;
import com.mhc.bean.Response;
import com.mhc.bean.User;
import com.mhc.service.CartService;
import com.mhc.service.MedicineService;
import com.mhc.service.OrderDetailService;
import com.mhc.service.OrderService;
import com.mhc.service.UserService;

@SpringBootTest
class SbMhcApplicationTests {
	
	@Autowired
	UserService userservice;

	@Autowired
	OrderService orderservice;

	@Autowired
	MedicineService medservice;

	@Autowired
	CartService cartservice;

	@Autowired
	OrderDetailService ordService;

	boolean res;
	boolean val;
	List<User> list = new ArrayList<>();
	List<User> list1 = new ArrayList<>();
	List<Medicine> list2 = new ArrayList<>();
	List<Medicine> list3 = new ArrayList<>();
	List<Orders> list4 = new ArrayList<>();
	List<Orders> list5 = new ArrayList<>();

	User ur=new User(1,"Admin","admin","admin1324@relevantz.com","9629169916","9629169916");
	User ur1=new User(2,"Shaji","user","b.shaji245@gmail.com","123456","7418952833");
	User ur2=new User(3,"Ram","user","ram1324@gmail.com","1234567","1234567890");
	User ur3=new User(4,"Prakash","user","prakash1124@gmail.com","12345678","0987654321");
	Response rs1=new Response("Customer Success");
	Response rs2=new Response("Admin Success");
	Response rs3=new Response("Login Fail");
	Medicine pr1=new Medicine(1,"Paracetamol","Fever,Cold,Cough",100.99);
	Medicine pr2=new Medicine(2,"Inhaler","Cold&Cough",113.11);
	Orders ord1 = new Orders(1,"ABC123","Pending","2024-02-10");
	Orders ord2 = new Orders(2,"ABC345","Shipped","2024-02-10");

	@Test
	@Order(1)
	void contextLoads() {
		
	}
	
	@Test
	@Order(2)
	  void performUserLogin() {
		  Response rs=userservice.login(ur);
		  rs1.equals(rs);
	  }	

	@Test
	@Order(3)
	  void performAdminLogin() {
		  Response rs=userservice.login(ur1);
		  rs2.equals(rs);
	  }

	@Test
	@Order(4)
	  void performSupplierLogin() {
		  Response rs=userservice.login(ur2);
		  rs2.equals(rs);
	  }

	@Test
	@Order(5)
	  void performLoginFail() {
		  Response rs=userservice.login(ur2);
		  rs3.equals(rs);
	  }

	@Test
	@Order(6)
	void performRegister() {
		  val=true;
		  res=userservice.createUser(ur1);
		  assertEquals(val,res);
	}
	@Test
	@Order(7)
	void performUserInsert() {
		  val=true;
		  res=userservice.createUser(ur);
		  assertEquals(val,res);
	}
	//
	@Test
	@Order(8)
	void performUserDelete() {
		  val=true;
		  res=userservice.deleteUser(3);
		  assertEquals(val,res);
	}

	@Test
	@Order(9)
	void performViewAllUsers() {
		list1=userservice.getAllUsers();
		list.add(ur);
		list.add(ur1);
		list.equals(list1);
	}


	@Test
	@Order(10)
	void performMedicineInsert() {
		  val=true;
		  res=medservice.createMedicine(pr1);
		  assertEquals(val,res);
	}

	@Test
	@Order(11)
	void performMedicineUpdate() {
		 val=true;
	 	  res=medservice.updateMedicine(pr1);
	 	  assertEquals(val,res);
	}

	@Test
	@Order(12)
	void performMedicineDelete() {
		  val=true;
		  res=medservice.deleteMedicine(pr1.getId());
		  assertEquals(val,res);
	}

	@Test
	@Order(13)
	void performViewAllMedicines() {
		list2=medservice.getAllMedicines();
		list3.add(pr2);
		list3.equals(list2);
	}

}