package testCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAfterMethod {
	@Test
	  public void testcase01() {
		  System.out.println("testcase01");
	  }
	  @Test
	  public void testcase02() {
		  System.out.println("testcase02");
	  }
	  @Test
	  public void testcase03() {
		  System.out.println("testcase03");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeClass");
	  }
	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterClass");
	  }
  
}
