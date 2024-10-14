package testCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="data-provider")
  public void testCase01(int a,int b) {
	  System.out.println(a+b);
	    
  }
  
  @Test(dataProvider="data-provider",dataProviderClass=BasicTestCase.class)
  public void testCase02(int a,int b,String s) {
	  System.out.println(a+b); 
	  System.out.println(s);
  }
  @Test(dataProvider="data-provider-01")
  public void testCase03(int a,int b,int c) {
	  System.out.println(a+b+c);
	    
  }
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
	return new Object[][] {{2, 3 }, {5, 7},{20,10},{23,25},{41,23}};
	}
  @DataProvider (name = "data-provider-01")
	public Object[][] dpMethod1(){
	return new Object[][] {{2, 3,4 }, {5,6,7},{20,10,9},{0,23,25},{5,41,23}};
	}
  
  
  
}
