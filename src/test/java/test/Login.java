package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public void loginPage() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://demo.testfire.net/login.jsp");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("uid")).sendKeys("jsmith");
	driver.findElement(By.id("passw")).sendKeys("demo1234");
	driver.findElement(By.name("btnSubmit")).click();
	driver.close();
	
	}
	
}
