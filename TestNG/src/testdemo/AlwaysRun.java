package testdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	WebDriver driver;
	
	@Test
	  public void startapp() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		//driver.manage().window().maximize();
		  System.out.println("start app");
	  }
	 @Test(dependsOnMethods="startapp")
	  public void checktitle() throws InterruptedException {
		  driver.findElement(By.id("Email")).sendKeys("pavan.kalluri1997@gmail.com");
		  driver.findElement(By.name("Password")).sendKeys("pavan1234");
		  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		  String expname="Demowebstore";
		  String actualname=driver.getTitle();
		  Assert.assertEquals(expname, actualname);
		  driver.findElement(By.linkText("Log out")).click();
		  System.out.println("log off application");
	  }
	 @Test(dependsOnMethods="checktitle",alwaysRun=true)
	  public void logoff() {
		  
		  System.out.println("log off");
		  driver.close();
	  }
	  
}
