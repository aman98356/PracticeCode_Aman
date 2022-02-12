package core_Java;

public class Basics {	

	
		public static final String collegeName = "JNTU";
		//integer : byte , short , int , long
		public               int   studentNumber = 225678;
		private             double studentMarks = 88.87;
		protected			char   studentGrade = 'A';  //default - package level visibility
							boolean studentResult = true;
		
		//Member of a class can start with _ , $ , a-z , A-Z 
							// should follow camelCasing 
							//No blank space with in the name of class member
							//No reserved keywords should be used in the name
		int _stdNum;  int $stdNum;  int stdNum;  int StdNum;
		
		int std1Num;  int stdNum1; int std_Num; int std$Num; int stdNum_; int stdNu$;
		
		//int %stdNum;  int 1stdNum; int std Num; int std&Num; int stdNum%; int class;
		
		
		public static void main(String[] args)  //String[] is to pass Command line arguments
		{
			System.out.println("Welcome to Selenium Java Automation");		
			addition(65,88);
			addition();
			addition(55,"Ram");
			int gSal = employeeGrossSalary(65,88,34); //basic+HRA+specials
			int myNetSal = netSalary(gSal);
			System.out.println("The Net Salary of the Employee :" + myNetSal);
			//return myNetSal;
		}	
		
		public static int employeeGrossSalary(int basic,int hra,int specials)
		{
			int grossSal = basic+hra+specials;
			return grossSal;
		}
		public static int netSalary(int gross)
		{
			int net = gross + 50000;
			return net;
		}
		static int sum;
		
		private static void addition() //concrete function   // cabin1
		{
			//body
			sum = 22+25; //Hard coded values
			System.out.println("Sum of Two Numbers :" + sum);
		}
		
		public static void addition(int a,int b)  //cabin2
		{
			 sum = a+b;
			System.out.println("Sum of Two Numbers [2 inputs]:" + sum);
		}
		public static int addition(int a,int b, int c)  //cabin3
		{
			sum = a+b+c;
			//System.out.println("Sum of Three Numbers[3 inputs] :" + sum);
			sum = sum+45;
			return sum;
			//sum = sum+45; unreachable code
		}
		
		public static void addition(int a,String b)  //cabin2
		{
			String sum = a+b; //int+int = int , int+string or string+int or string+string : string
			System.out.println("Sum of Two Numbers :" + sum);
		}
}
