package myTestNG.myTestNG;

import org.testng.annotations.Test;

public class AnnotationsDemoTest {
	//with same priority it will take alphabatical order. 
  @Test
  public void f() {
	  System.out.println("stsrt app");
  }
  @Test
  public void f1() {
	  System.out.println("log in ");
  }
  @Test
  public void f2() {
	  System.out.println("log off");
  }
}
