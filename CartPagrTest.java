package com.test1.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPagrTest {
  
private WebDriver driver;
	
	
	@BeforeMethod
public void beforeMethod () {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madal\\Desktop\\code\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);

	}
	
	
	@Test
	  public void testCartEmptyMessage() throws InterruptedException {
	  
	 driver.get("http://test1.absofttrainings.com/cart/");
	 
	 Thread.sleep(3000);
	 
	 Assert.assertEquals(
			 driver.findElement(By.id("cart_empty")).getText(),"Your cart is currently empty.","cart empty message is wrong");
		}
	
	@AfterMethod
	 
	 public void afterMethod(){
		driver.quit();
		}
	
	
	
	
	
	
}
