package core_Java;

import org.junit.Test;
// Practicing conditional statement in java 
public class AdditionPerform
{
	
	public void AdditionPerforms(int a, int b)
	{
		if(a==b) {
			int sum =a+b;
			System.out.println("sumation value = " + sum);
		}
		else 
		{
			int substract=b-a;
			System.out.println("substraction value = " + substract);
		}
		
	}
	@Test
	public void AdditionPerformTest() 
	{
		AdditionPerforms(25,44);
		AdditionPerforms(44,44);
	}
}
