package array;

import org.junit.Test;

public class BasicArrays
{
	// In this class, printing the length of an array
	//Fixed Array: Length of the array is fixed . Elements also will be fixed .
	//Dynamic Array : Length of the array is fixed .Elements can be loaded in to the array at run time .
	
	public int rollNum = 22;
	
	//Method having Fixed Array and taking the length of this array. Printing the values present in Array after reading the value
	@Test
	public void fixedIntegerArray()
	{   //                0	 1  2 3  4  5  6  7  8  9                          18  19
		int[] numbers = {22,24,26,28,29,32,34,35,38,39,43,45,47,48,54,56,58,52,22};
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		int value = numbers[0]; // read the value
		numbers[1] = 55; //write the value
		
		for(int i=0;i<len;i++) // i = 0 ....18 19
		{
			System.out.println("Elements before :" + numbers[i]); // i =0 1 2 3 4 5
		}		
	}	
	//Method having dynamic Array and taking the length of this array. Printing the values present in Array after reading the value
	
	@Test
	public void dynamicIntegerArray()
	{   
		int[] numbers = new int[20];
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		
		for(int i=0;i<len;i++)
		{
			numbers[i] = 22+i;
			System.out.println("Elements after :" + numbers[i]);
		}
	}	
}	
