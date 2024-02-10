//package com.mhc;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.sql.Timestamp;
//
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.mhc.bean.Medicine;
//import com.mhc.bean.Response;
//import com.mhc.bean.User;
//import com.mhc.controller.MedicineController;
//import com.mhc.controller.OrderController;
//import com.mhc.controller.OrderDetailController;
//import com.mhc.controller.UserController;
//import com.mhc.service.UserService;
//
//@SpringBootTest
//class SbMhcApplicationTests {
//
//	@Autowired
//	UserController user;
//	@Autowired
//	MedicineController medicine;
//	@Autowired
//	OrderController order;
//	@Autowired
//	OrderDetailController orderDetail;
//
//	String login;
//	String register;
//	String insert;
//	String update;
//	String delete;
//	String result;
//	String result1;
//
//	List<User> list = new ArrayList<User>();
//	List<User> list1 = new ArrayList<User>();
//	User user1 = new User();
//	User user2;
//
//	@Test
//	@Order(1)
//	void contextLoads() {
//	}
//
//	// ********User & Admin Module******//
////	@Test
////	@Order(2)
////	void performLogin() {
////		User login = new User(2l, "Shaji", "user", "123456", "b.shaji245@gmail.com", "9629169916");
////		Response expectedResponse = new Response("User Success");
////		Response actualResponse = login.userName(login);
////		expectedResponse.equals(actualResponse);
////		assertEquals(expectedResponse, actualResponse);
////	}
////
////	@Test
////	@Order(3)
////	void performLoginFail() {
////		Login log1 = new Login("sara", "9087", "s@gmail.com", "9078567867");
////		Response rs1 = new Response("Login Fail");
////		Response rs = login.login(log1);
////		rs1.equals(rs);
////	}
//
//	@Test
//	@Order(4)
//	public void testAddUser() {
//		User user = new User();
//		user.setUserId(4l);
//		user.setUserName("Shaji");
//		user.setUserType("user");
//		user.setPassword("123456");
//		user.setEmail("b.shaji245@gmail.com");
//		user.setPhone("9629169916");
//		insert = "Inserted";
//		result = UserService.createUser(user);
//		assertEquals(insert, result);
//	}
//
////	@Test
////	@Order(5)
////	public void testUpdateUser() {
////		User user = new User();
////		user.setUserId(2l);
////		user.setUserName("Shaji Ram Prakash");
////		user.setUserType("user");
////		user.setPassword("123456");
////		user.setEmail("b.shaji245@gmail.com");
////		user.setPhone("1234567890");
////		update = "Updated";
////		result = user.performUpdateUsers(user);
////		assertEquals(update, result);
////	}
////
////	@Test
////	@Order(6)
////	public void testDeleteUser() {
////		delete = "Deleted";
////		result = user.performDeleteVendor(2l);
////		assertEquals(delete, result);
////	}
////
////	@Test
////	@Order(7)
////	public void testGetAllUserDetails() {
////		list = user.getAllUsers();
////		user1 = new User(2l, "Shaji", "user", "123456", "b.shaji245@gmail.com", "9629169916");
////		user2 = new User(3l, "Shaji Ram", "user", "123456", "b.shaji245@gmail.com", "7418952833");
////		list1.add(user1);
////		list1.add(user2);
////		list.equals(list1);
////	}
////
////	// ******Order Module******////
////	List<com.mhc.bean.Order> ordlist = new ArrayList<com.mhc.bean.Order>();
////	List<com.mhc.bean.Order> ordlist1 = new ArrayList<com.mhc.bean.Order>();
////	com.mhc.bean.Order ord1 = new com.mhc.bean.Order();
////	com.mhc.bean.Order ord2;
////
////	@Test
////	@Order(8)
////	public void testInsertOrder() {
////		com.mhc.bean.Order ord = new com.mhc.bean.Order();
////		ord.setOrderId(1l);
////		ord.setOrderDate("09/02/24");
////		ord.setTotalAmount(500.00);
////		ord.setQuantity(10);
////		ord.setUserName("Shaji");
////		ord.setMedicineName("Paracetamol");
////		insert = "Inserted";
////		result = ord.performInsertOrders(ord);
////		assertEquals(insert, result);
////	}
////
////	@Test
////	@Order(9)
////	public void testUpdateOrders() {
////		com.mhc.bean.Order ord = new com.mhc.bean.Order();
////		ord.setOrderId(1l);
////		ord.setOrderDate("09/02/24");
////		ord.setTotalAmount(500.00);
////		ord.setQuantity(10);
////		ord.setUserName("Shaji Ram");
////		ord.setMedicineName("Inhaler");
////		update = "Updated";
////		result = order.performUpdateOrders(ord);
////		assertEquals(update, result);
////	}
////
////	@Test
////	@Order(10)
////	public void testDeleteOrders() {
////		delete = "Deleted";
////		result = order.performDeleteOrders((long) 1l);
////		assertEquals(delete, result);
////	}
////
//////	@Test
//////	@Order(11)
//////	public void testGetAllOrderDetails() {
//////		ordlist = order.getAllOrders();
//////		ord1 = new com.mhc.bean.Order(1l, "09/02/24", 500.00, 10,"user", "Shaji", "Paracetamol","1/131");
//////		ord2 = new com.mhc.bean.Order(2l, "09/02/24", 600.00, 10, "user", "Shaji Ram", "Inhaler");
//////		conlist.add(con1);
//////		conlist1.add(con2);
//////		conlist.equals(conlist1);
//////	}
//
//
//}
