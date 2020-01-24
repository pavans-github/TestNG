package myTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {

//seqence the tests will run.	
	@BeforeSuite
public void setproperty(){
	System.out.println("set the driver path");
}
@BeforeTest
public void openchrome(){
	System.out.println("open chrome");
}
@BeforeClass
public void openapp(){
	System.out.println("application");
}
@BeforeMethod
public void gettittle(){
	System.out.println("display title");
}
@Test
public void chechtitle(){
	System.out.println("check title");
}
@AfterMethod
public void Login(){
	System.out.println("Login to test");


}
@AfterClass
public void Logout(){
	System.out.println("Logout from test");
}

@AfterTest
public void closebrowser(){
	System.out.println("close browser");
}
}

