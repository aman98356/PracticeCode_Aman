package array;

import org.junit.Test;

//Taking values in an array and taking which Element is even number
public class EvenInArray 
{
	@Test
	 public void EvenNumber() 
	{
		int [] numbers = {22,54,65,45,78,29,56,35,28,22};
		int len = numbers.length;
		int [] a= new int[len];
		int countEven = 0;
		
		for(int i=0;i<len;i++) 
		{
			for(int j=countEven ;j<len;j++)
			{	
			
				if(numbers[i]%2 == 0) 
				{
					a[j]= numbers[i];
					countEven++;
					break;
				}
			}
		}
		
		System.out.println("All the even numbers in array are:");
		for(int k=0;k<a.length; k++) 
		{
			System.out.println(a[k]);
		}
	}
}
