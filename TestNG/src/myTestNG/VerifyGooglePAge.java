package myTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyGooglePAge {
WebDriver driver;
	
	@BeforeMethod
	  public void startapp() {
	
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		  System.out.println("start app");
	  }
	@Test
	public void checktitle(){
			String title="google";
		  String excepted=driver.getTitle();
		  Assert.assertEquals(excepted, title);
	}
	@Test(priority=1)
	public void checklogo(){
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
	}
	@AfterMethod
	public void closebrowser(){
		driver.close();
	}

}
