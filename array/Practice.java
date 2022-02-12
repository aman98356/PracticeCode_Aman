package array;

import org.junit.Test;
//Practicing the array concept and reading the values of Elements in the array using looping statement.
public class Practice 
{
	@Test
	public void practice1()
	{
		int [] numbers = {22,33,29,57,62,46,92};
		int len= numbers.length;
		System.out.println(len);
		numbers[2]=44;
		int value =numbers [0];
		System.out.println("number at first Place : " + value);
		System.out.println(numbers[2]);
	
	for(int i=0; i<value; i++) 
	{
		System.out.println(numbers[i]);
	}
	}
}
