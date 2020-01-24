package myTestNG.myTestNG;

import org.testng.annotations.Test;

public class DependsOn {
	//priority>dependsonmethod
	@Test
	  public void startapp() {
		  System.out.println("start app");
	  }
	  @Test
	  //(dependsOnMethods="startapp")
	  public void login() {
		  System.out.println("log in ");
	  }
	  @Test(dependsOnMethods="login")
	  public void logoff() {
		  System.out.println("log off");
	  }
}
