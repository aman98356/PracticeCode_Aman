package inheritance;

import org.junit.Test;
// TestCase is a child class inherited the property of Parent class- Gmail
public class TestCases extends Gmail
{
	//Method should not have any -  arguments,outputs,static , must be public
		@Test
		public  void composeAndSendAnEmail() //Java function
		{
			System.out.println("Test Case : ComposeAndSendAnEmail ");
			launchApplication();
			loginToApplication();
			compose();
			open();
			send();
			logoutFromApplication();
			closeApplication();
		}
		@Test
		public  void replyToAnEmail() //Java function
		{
			System.out.println("Test Case : Reply to An Email");
			launchApplication();
			loginToApplication();
			open();
			reply();
			logoutFromApplication();
			closeApplication();
		}
		@Test
		public  void forwardAnEmail()
		{
			System.out.println("Test Case : Forward An Email");
			launchApplication();
			loginToApplication();
			open();
			forward();
			logoutFromApplication();
			closeApplication();
		}
		@Test
		public  void deleteAnEmail()
		{
			System.out.println("Test Case : Delete An Email");
			launchApplication();
			loginToApplication();
			open();
			delete();
		}



	
}

