package constructor;

import org.junit.Test;
//Creating an object for the class and calling the methods from TestCasesConstructor.java Class
public class TestSuitesConstructor 
{
	TestCasesConstructor Tc=new TestCasesConstructor();

	//----------------- Test Suites ------------------------
	//Function having different method from TestCasesConstructor.java class
			@Test
			public void smokeSuite()
			{
				System.out.println("Test Suite : SMOKE");
				Tc.composeAndSendAnEmail();
				Tc.forwardAnEmail();
			}
			@Test
			public void regressionSuite()
			{
				System.out.println("Test Suite : REGRESSION");
				Tc.composeAndSendAnEmail();
				Tc.forwardAnEmail();
				Tc.replyToAnEmail();
				Tc.deleteAnEmail();
			}
}
