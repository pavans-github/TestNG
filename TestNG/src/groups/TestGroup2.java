package groups;

import org.testng.annotations.Test;

public class TestGroup2 {
	@Test(groups = {"regression"})
	  public void testMethod1() {
		  System.out.println("first regression testing");
	  }
	@Test(groups = {"regression"})
	  public void testMethod2() {
		  System.out.println("second regression testing");
	}  
	@Test(groups = {"smoke"})
	public void testMethod3() {
	 System.out.println("third smoke testing");
	}	  
			  @Test(groups = {"regression"})
			  public void testMethod4() {
				  System.out.println(" regression testing");

}
			  }
