package inheritance;

import org.junit.Test;
//TestSuites class inherited the parent class-TestCases.
public class TestSuites extends TestCases
{
	//----------------- Test Suites ------------------------
		@Test
		public void smokeSuite()
		{
			System.out.println("Test Suite : SMOKE");
			composeAndSendAnEmail();
			forwardAnEmail();
		}
		@Test
		public void regressionSuite()
		{
			System.out.println("Test Suite : REGRESSION");
			composeAndSendAnEmail();
			forwardAnEmail();
			replyToAnEmail();
			deleteAnEmail();
		}
}
