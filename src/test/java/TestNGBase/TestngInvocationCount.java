package TestNGBase;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestngInvocationCount {
	@Test(invocationCount = 10)
	   public void testcase1(ITestContext testContext){
	      System.out.println("Running testcase 1");
	      int currentCount = testContext.getAllTestMethods()[0].getCurrentInvocationCount();
	      System.out.println("Executing count: " + currentCount);
	   }
	   @Test(invocationCount = 10)
	   public void testcase2(ITestContext testContext){
	      System.out.println("Running testcase 2");
	      int currentCount = testContext.getAllTestMethods()[1].getCurrentInvocationCount();
	      System.out.println("Executing count: " + currentCount);
	   }
}