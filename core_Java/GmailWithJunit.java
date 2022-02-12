package core_Java;

import org.junit.Test;

public class GmailWithJunit
{
	//Method should not have any -  arguments,outputs,static - must be public
	@Test
	public  void composeAndSendAnEmail() //Java function
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");
	}
	@Test
	public  void replyToAnEmail() //Java function
	{
		System.out.println("Test Case : Reply to An Email");
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email");
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email");
	}
}
