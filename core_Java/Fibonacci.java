package core_Java;
// code having Fibonacci series
public class Fibonacci 
{
	public static int count = 10;
	public static int [] num = new int[count];
	public static void main(String []args) 
	{
		num [0]=0; //Adding Element
		num[1]= 1;
		
		for(int i=2; i< count ; i++) 
		{
			num [i]=num[i-1]+ num[i-2];
		}
		System.out.println("Fibonacci series will be : ");
		for(int i=1 ; i<count;i++) {
		System.out.println(num[i]);
		}
	}
}
