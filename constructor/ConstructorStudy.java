package constructor;

public class ConstructorStudy
{
//Practicing Parameterized constructor
	int id;
	String name;
	public ConstructorStudy(int EmpID, String Ename ) 
	{
		id=EmpID;
		name=Ename;		
	}	
	public ConstructorStudy() 
	{
		id=101;
		name="Manjot";
	}
}

