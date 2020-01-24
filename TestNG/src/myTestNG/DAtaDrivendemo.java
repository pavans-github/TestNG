package myTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DAtaDrivendemo {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
		
		driver.get("http://demowebshop.tricentis.com/login");
		//driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(username);
		  driver.findElement(By.name("Password")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		  
		  driver.findElement(By.linkText("Log out")).click();
		  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "pavan.kalluri1997@gmail.com", "pavan1234" },
      new Object[] { "pavani.kolluri@gmail.com", "pavani1234" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");

	 driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
