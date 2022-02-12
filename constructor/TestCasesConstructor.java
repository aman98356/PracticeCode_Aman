package constructor;

import org.junit.Test;
// Creating an object for the class and calling the methods from ReuseableComponent.java Class
public class TestCasesConstructor
{
	public TestCasesConstructor() 
	{
		
	}
	ReuseableComponent Rc=new ReuseableComponent();        //Creating an object for class ReuseableComponent
	
			//Function having different method from ReUseableComponent.java class
			@Test
			public  void composeAndSendAnEmail() //Java function
			{
				System.out.println("Test Case : ComposeAndSendAnEmail ");
				
				Rc.launchApplication();
				Rc.loginToApplication();
				Rc.compose(2);
				Rc.open();
				Rc.send();
				Rc.logoutFromApplication();
				Rc.closeApplication();
				System.out.println();
			}
			@Test
			public  void replyToAnEmail() //Java function
			
			{
				System.out.println("Test Case : Reply to An Email");
				Rc.launchApplication();
				Rc.loginToApplication();
				Rc.open();
				Rc.reply();
				Rc.logoutFromApplication();
				
				Rc.closeApplication();
				System.out.println();
			}
			@Test
			public  void forwardAnEmail()
			{
				System.out.println("Test Case : Forward An Email");
				Rc.launchApplication();
				Rc.loginToApplication();
				Rc.open();
				Rc.forward();
				Rc.logoutFromApplication();
				Rc.closeApplication();
				System.out.println();
			}
			@Test
			public  void deleteAnEmail()
			{
				System.out.println("Test Case : Delete An Email");
				Rc.launchApplication();
				Rc.loginToApplication();
				Rc.open();
				Rc.delete();
				System.out.println();
			}

}
