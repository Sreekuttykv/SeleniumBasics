package testCase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  @Test
  @Parameters({"parameter1","parameter2"})
  public void sampleTestCase(int a,String s) {
	  System.out.println(a+s);
  }
}
