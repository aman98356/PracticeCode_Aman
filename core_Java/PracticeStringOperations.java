package core_Java;

import org.junit.Test;

public class PracticeStringOperations 
{
	@Test
	public void Practicess() 
	{
		//Write a program to find the count of a particular character in the given string
		String name = "AmanKumarSingh";
		int count = name.length();
		System.out.println(count);
		System.out.println("String before triming : " + name); //String without trim operation
		String trimmedname = name.trim().toLowerCase().replace("aman", "naman");
		System.out.println("String After triming : " + trimmedname);
		System.out.println("String count After triming : " + trimmedname.length());
		
		char Char02 = name.charAt(5);
		System.out.println("Character at 5th position : " + Char02);
		int count1 =0;
		for(int i=0; i<count; i++)
		{
			if(name.toLowerCase().charAt(i) =='a') 
			{
				count1++;
			}
		}
		System.out.println("Chatracter 'a' count = " + count1);
		
	}
}
