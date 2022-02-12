package core_Java;

import org.junit.Test;

public class StringOperations
{
	String a = "       Selenium With Java           ";
	String b = "JAVA";
	String d = "JAVA";
	String c = "   Selenium With JAVA                   ";
	@Test
	public void basicStringFunctions()
	{
		int len = a.length();
		System.out.println("Length of the string :"+ len);
		System.out.println("String before triming :" + a);
		String aT = a.trim();
		System.out.println("String after triming :" + aT);
		System.out.println("Length of the string after trimming :" + aT.length());
		String aL = a.trim().toLowerCase();
		System.out.println("String after lower case conversion:" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String after upper case conversion :" + aU);
	}
	@Test
	public void stringContains()
	{
		if(a.trim().toLowerCase().contains(b.trim().toLowerCase()))
		{
			System.out.println("Sub String is there in main string");
		}
		else
		{
			System.out.println("Sub string is not there in the main string");
		}
	}
	@Test
	public void subString()
	{
		//SubString is a function in the string class where we can take only a part of main string
		String a8 = a.trim().substring(8);
		System.out.println("Substring from 8th place :" + a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("Substring from 0-8th place :" + a08);
	}
	@Test
	public void stringComparision()
	{
		
		if(b.equals(c))
		//if(a.trim().toLowerCase().equals(c.trim().toLowerCase()))
		//if(a.trim().toUpperCase().equals(c.trim().toUpperCase()))
		//if(a.trim().equalsIgnoreCase(c.trim()))
		
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}
		
	}
	@Test
	public void characterAt()
	{
		//CharAt function will return the character at the specified index value
		char myChar0 = a.trim().charAt(7);
		System.out.println("Character at 0 index : " + myChar0);
	}
	
	@Test
	public void characterCount()
	{
		int count = 0;
		int len = a.trim().length();
		for(int i=0;i<len;i++)
		{
			if(a.trim().charAt(i) == 'v')
			{
				count++;
			}
		}
		System.out.println("Character Count :" + count);
	}
	@Test
	public void stringConcatenation()
	{
		String d = a.concat(b);
		System.out.println("String d :" + d);
		String e = a.concat(b).concat(c); // a+b+c
		System.out.println("String e :" + e);
	}
	@Test
	public void stringReplace()
	{
		System.out.println("Original String :" + a);
		String aa = a.trim().replace("Java", "C#");
		System.out.println("Originl after replace :" + aa);
	}
}