package constructor;
// class having method overloading and some Reusable methods.
public class ReuseableComponent 
{
	public ReuseableComponent()
	{
		System.out.println("Cache Cleared");
		System.out.println("Open the Browser");
	}
	public ReuseableComponent(int version) {
		
		
		System.out.println(version);
	}
	
	public ReuseableComponent(String s) {
		System.out.println(s);
	}
	//----------------- Reusable Components -------------------------
			protected void launchApplication()
			{
				System.out.println("RC : Launch Application");
			}
			void loginToApplication()
			{
				System.out.println("RC : Login To Application");
			}
			protected void logoutFromApplication()
			{
				System.out.println("RC : Logout From Application");
			}
			protected void closeApplication()
			{
				System.out.println("RC : Close Application");
			}
			public void compose(int a)
			{
				System.out.println("RC : Compose an Email");
			}
			public void send()
			{
				System.out.println("RC : Send an Email");
			}
			protected void open()
			{
				System.out.println("RC : Open an Email");
			}
			public void reply()
			{
				System.out.println("RC : Reply to an Email");
			}
			public void forward()
			{
				System.out.println("RC : Forward an Email");
			}
			public void delete()
			{
				System.out.println("RC : Delete an Email");
			}
}
