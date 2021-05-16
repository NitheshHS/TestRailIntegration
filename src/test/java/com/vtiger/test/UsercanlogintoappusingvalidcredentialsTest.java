package com.vtiger.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gurock.test.TestRailManager;
import com.gurock.testrail.APIException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsercanlogintoappusingvalidcredentialsTest {
	
	@Test
	public void userCanloginToApp() throws Throwable, APIException {
		
		String TestCase_ID="1";
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager", Keys.ENTER);
		
		TestRailManager.addResultForTestCase(TestCase_ID, TestRailManager.TEST_CASE_PASSED_STATUS, "");
		
	}

}
