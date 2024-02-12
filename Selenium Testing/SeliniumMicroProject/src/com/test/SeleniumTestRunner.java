package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SeleniumTestRunner {

	static WebDriver driver;

	@BeforeClass
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	// To open Login page
	public void loginPage() {

		driver.get("http://localhost:4200/");

		driver.manage().window().maximize();

		// Add the values to User Login
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Shaji");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");

		// Click the Sign In operation
		WebElement SignInButton = driver.findElement(By.id("submit"));
		SignInButton.click();


	}

	@Test(priority = 2)
	// To open Register page
	public void registerPage() {

		driver.get("http://localhost:4200/");

		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create a new account")).click();
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Shaji Ram Prakash ");
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("b.shaji1324@gmail.com");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("1234567890");
		driver.findElement(By.cssSelector(".form-control:nth-child(8)")).click();
		driver.findElement(By.cssSelector(".form-control:nth-child(8)")).sendKeys("1234567890");
		driver.findElement(By.name("phone")).click();
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Shaji");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("submit")).click();

	}

	@Test(priority = 3)
	// To open Register page
	public void UserOperations() {

		driver.get("http://localhost:4200/");

		driver.manage().window().maximize();

		// Add the values to User Login
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Shaji");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");

		// Click the Sign In operation
		WebElement SignInButton = driver.findElement(By.id("submit"));
		SignInButton.click();

		driver.findElement(By.linkText("MyCart")).click();
		driver.findElement(By.cssSelector(".btn")).click();

	}

	@Test(priority = 4)
	// To open Admin page
	public void AdminOperations() {
		
		driver.get("http://localhost:4200/");
		
		driver.manage().window().maximize();

		// Add the values to User Login
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("9629169916");

		// Click the Sign In operation
		WebElement SignInButton = driver.findElement(By.id("submit"));
		SignInButton.click();
		
		driver.findElement(By.linkText("User Management")).click();

	}

//		driver.findElement(By.className("example-icon")).sendKeys(Keys.ENTER);
//		System.out.println(driver.getTitle());
//
//		WebElement insertMenu = driver.findElement(By.cssSelector("a[routerLink='Insert'] button"));
//		insertMenu.click();
//		System.out.println(driver.getTitle());
//
//		//Add the values to Insert
//		WebElement laptopId = driver.findElement(By.name("id"));
//		laptopId.sendKeys("11");
//
//		WebElement laptopBrandName = driver.findElement(By.name("brandname"));
//		laptopBrandName.sendKeys("DELL");
//
//		WebElement laptopModelName = driver.findElement(By.name("modelname"));
//		laptopModelName.sendKeys("Dell13");
//
//		WebElement laptopPrice = driver.findElement(By.name("price"));
//		laptopPrice.sendKeys("100000");
//
////		 Submit the Insert operation
//		WebElement insertButton = driver.findElement(By.id("submit"));
//		insertButton.click();
}
//
//	@Test(priority = 2)
//	// To open Update page
//	public void updateLaptopPage() {
//		
//		driver.get("http://localhost:4200/");
//
//		driver.findElement(By.className("example-icon")).sendKeys(Keys.ENTER);
//		System.out.println(driver.getTitle());
//		
//		//Set the values to update
//		WebElement updateMenu = driver.findElement(By.cssSelector("a[routerLink='Update'] button"));
//		updateMenu.click();
//		System.out.println(driver.getTitle());
//
//		WebElement laptopId = driver.findElement(By.name("id"));
//		laptopId.sendKeys("11");
//
//		WebElement laptopBrandName = driver.findElement(By.name("brandname"));
//		laptopBrandName.sendKeys("DELL");
//
//		WebElement laptopModelName = driver.findElement(By.name("modelname"));
//		laptopModelName.sendKeys("Dell24");
//
//		WebElement laptopPrice = driver.findElement(By.name("price"));
//		laptopPrice.sendKeys("100000");
//
////		 Submit the Update operation
//		WebElement updateButton = driver.findElement(By.id("submit"));
//		updateButton.click();
//	}
//
//	@Test(priority = 3)
//	// To open Delete page
//	public void deleteLaptopPage() {
//		
//		driver.get("http://localhost:4200/");
//
//		driver.findElement(By.className("example-icon")).sendKeys(Keys.ENTER);
//		System.out.println(driver.getTitle());
//
//		WebElement deleteMenu = driver.findElement(By.cssSelector("a[routerLink='Delete'] button"));
//		deleteMenu.click();
//		System.out.println(driver.getTitle());
//
//		//Selecting the value to delete
//		WebElement laptopId = driver.findElement(By.name("id"));
//		laptopId.sendKeys("11");
//
////			 Submit the Delete operation
//			WebElement deleteButton = driver.findElement(By.id("submit"));
//			deleteButton.click();
//	}
//
//	@Test(priority = 4)
//	// To open ViewAll page
//	public void viewAllLaptopPage() {
//	
//		driver.get("http://localhost:4200/");
//
//		driver.findElement(By.className("example-icon")).sendKeys(Keys.ENTER);
//		System.out.println(driver.getTitle());
//
//		WebElement viewAllMenu = driver.findElement(By.cssSelector("a[routerLink='ViewAll'] button"));
//		viewAllMenu.click();
//		System.out.println(driver.getTitle());
//	}
//
//	@AfterClass
//	// Close the Browser
//	public void close() {
//		driver.close();
//	}
//}
