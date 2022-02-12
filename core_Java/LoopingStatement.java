package core_Java;

import org.junit.Test;
//Print a statement in which apply color on different staircase
public class LoopingStatement {
	// Applying color on continuous staircase
	@Test
	public void Applycolor()
	{
		for(int i=1; i<50; i=i+1)
		{
			System.out.println("Apply Color on staircase : "+ i);
		}
	}
	// Applying color on odd staircase
	@Test
	public void Applycolorodd() 
	{
		for(int i=1; i<=50;i=i+2) 
		{
			System.out.println("Apply color to Odd staircase : " + i);
		}
	}
	// Applying color on Even staircase
	@Test
	public void ApplycolorEven() 
	{
		for(int i=2; i<=50;i=i+2) 
		{
			System.out.println("Apply color to Even staircase : " + i);
		}
	}
}
