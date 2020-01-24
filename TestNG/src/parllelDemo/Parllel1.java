package parllelDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Parllel1 {
public WebDriver driver;
	
	@Test
	  public void startapp() {
	
	
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title="Google";
		  String excepted=driver.getTitle();
		  Assert.assertEquals(excepted, title);
		driver.quit();
	}
	@Test
	public void startapp1() {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title="oogle";
		  String excepted=driver.getTitle();
		  Assert.assertEquals(excepted, title);
		  driver.quit();
	
		
}
	
}
