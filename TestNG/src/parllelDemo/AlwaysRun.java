package parllelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	WebDriver driver;
	
	@Test
	  public void startapp() {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		//driver.manage().window().maximize();
		  //System.out.println("start app");
		  driver.findElement(By.id("Email")).sendKeys("pavan.kalluri1997@gmail.com");
		  driver.findElement(By.name("Password")).sendKeys("pavan1234");
		  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		  String expname="Demowebshope";
		  String actualname=driver.getTitle();
		  Assert.assertEquals(expname, actualname);
		  driver.findElement(By.linkText("Log out")).click();
		  driver.close();
	}
	 
}
