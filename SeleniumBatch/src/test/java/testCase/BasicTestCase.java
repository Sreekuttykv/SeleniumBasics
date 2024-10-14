package testCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTestCase {
  @Test(priority=-2,groups="smoke")
  public void testcase09()
  {
	  System.out.println("testcase01");
  }
  @Test(priority=-1)
  public void testcase12()
  {
	  System.out.println("testcase02");
  }
  @Test(priority=1,groups="smoke")
  public void testcase03()
  {
	  System.out.println("testcase03");
  }
  @Test(enabled=false)
  public void testcase04()
  {
	  System.out.println("testcase04");
  }
  @Test(priority=2,enabled=true)
  public void testcase05() 
  {
	  System.out.println("testcase05");
  }
  
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
	return new Object[][] {{2, 3,"test" }, {5, 7,"hello"},{20,10,"hii"},{23,25,"testng"},{41,23,"hlo"}};
	}
}
