package core_Java;

import org.junit.Test;

public class ConditionalStatement {
	//Assignment : write a Program to read two input number, Perform Addition if numbers are equal
	public void PerformOperation(int a, int b){
	if (a==b) {
		
		int sum = a+b;
		System.out.println("the value is :"+ sum);
	}
	else {
		System.out.println("Not Equal");
	}
		
	}	
	@Test
	public void PerformOperation_Test() {
		PerformOperation(44,44);
		PerformOperation(24,44);
	}
	
	//Assignment : write a Program to read two input number, Perform Addition if numbers are equal
	//and do substraction if not equal
	
	public void PerformOperation_(int a, int b) {
	if(a==b) {
		int sum=a+b;
		System.out.println("the value is :"+ sum);
	}	
	else {
		int diff=a-b;
		System.out.println("Else value is :"+ diff);
	}
	}
	@Test
	public void PerformOperation_test1() {
		PerformOperation_(48,48);
		PerformOperation_(48,42);
	}
	
	//Assignment : write a Program to read two input number, Perform Addition if numbers are equal
		//and do substraction if a>b, and do multiplication if a<b
	
	public void PerformingOperation(int a, int b) {
		if (a==b) {
			int sum = a+b;
			System.out.println("sum value :"+ sum);
		}
		else if(a>b) {
			int diff=a-b;
			System.out.println("diff value :"+ diff);
		}
		else if(a<b) {
			int multi=a*b;
			System.out.println("multi value :"+ multi);
		}
	}
	//Test method for the PerformingOperation function.
	@Test
	public void PerformingOperation_Test() {
		PerformingOperation(22,22);
		PerformingOperation(22,23);
		PerformingOperation(23,20);
	}
	
	public void LogicalOperator(int a, int b) {
		if((a>10) && (b>10)){
			int divide = a/b;
			System.out.println("Perform the task :"+ divide);
		}
		else{
			System.out.println("No Task to Perform");
		}
	}
	@Test
	public void LogicalOperator() {
		LogicalOperator(5,5);
		LogicalOperator(5,15);
		LogicalOperator(15,15);
	}
	//**************switch(expression) { case 1 : task case 2 : Task ......}****************
public void multipleDecisions(char grade) //Dev Code
{
	switch(grade)
	{
		case 'A' :
		{
			System.out.println("Student Passed in Distintion , Grade : "+ grade);
			break;
		}
		case 'B' :
		{
			System.out.println("Student Passed in First Class , Grade : "+ grade);
			break;
		}
		case 'C' :
		{
			System.out.println("Student Passed in Second Class , Grade : "+ grade);
			break;
		}
		case 'D' :
		{
			System.out.println("Student Passed in Third class , Grade : "+ grade);
			break;
		}
		case 'E' :
		{
			System.out.println("Student Passed  , Grade : "+ grade);
			break;
		}
		case 'F' :
		{
			System.out.println("Student Failed , Grade : "+ grade);
			break;
		}
		default :
		{
			System.out.println("Grade is not valid : " + grade);
			break;
		}
	}
}
//Test method for the multipleDecisions function
@Test	
public void multipleDecisions_Test()
	{
	multipleDecisions('B');
	multipleDecisions('F');
	multipleDecisions('E');
	multipleDecisions('A');
	multipleDecisions('C');
	multipleDecisions('K');
	multipleDecisions('D');
	multipleDecisions('I');
	multipleDecisions('G');
	}

// Character count present in a String
@Test
public void characterCount()
{
	String a="    java with selenium";
	int count = 0;
	int len = a.trim().length();
	for(int i=0;i<len;i++)
	{
		if(a.trim().charAt(i) == 'a')
		{
			count++;
		}
	}
	System.out.println("Character Count :" + count);
}
}


