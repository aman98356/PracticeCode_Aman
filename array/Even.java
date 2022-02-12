package array;

import org.junit.Test;

// Taking values in an array and reading which value is odd or even number
public class Even 
{
	@Test
	public void EvenOddfilter()
	{
		int[] numbers = {22,45,72,63,87,92,20};
		int len = numbers.length;
		System.out.println("Total Element present in array is " + len);
		
    
	for(int i=0;i<len;i++) 
    {
    	if(numbers[i] %2 ==0)
    	{
    		
    		System.out.println(numbers[i] + ": Even");
    	}
    	else
    	{
    		System.out.println(numbers[i] + ": Odd");
    	}
    }
	}
}
