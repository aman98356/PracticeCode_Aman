package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import org.junit.Test;
// practicing different collections in java like treeset, hashmap.
public class MyLists
	{
	
	@Test
	public void treeSet()
    {
    	 TreeSet<String> al=new TreeSet<String>();  
    	  al.add("Ravi");  
    	  al.add("Vijay");  
    	  al.add("Ram");  
    	  al.add("Ajay");    
    	  Iterator<String> itr=al.iterator();  
    	  while(itr.hasNext())
    	  {  
    	   System.out.println(itr.next());  
    	  }
    }  
	@Test
	public void hashMap()  
    {
		//HashMap<key,value>
       HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"Ram");  //Put elements in Map  
	   map.put(2,"Ajay");    
	   map.put(3,"Krishna");   
	   map.put(4,"Ganesh");   
	   //Create child map
	   HashMap<Integer,String> cMap=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(5,"Ramesh");   
	   map.put(6,"Ajay");    
	   map.put(7,"RaviKrishna");   
	   map.put(4,"Ganesh"); 
	   //---------------------
	   map.putAll(cMap);
	   System.out.println("one : " + map.get(3));
	   System.out.println("Length of the map :" + map.size());
	   System.out.println("Iterating Hashmap...");  

	  for(Map.Entry m : map.entrySet())
	  {
		  System.out.println(m.getKey()+" "+m.getValue());
	  }
	  map.remove(6);
	  System.out.println("Length of the map after :" + map.size());
	   System.out.println("Iterating Hashmap...");  

	  for(Map.Entry m : map.entrySet())
	  {
		  System.out.println(m.getKey()+" "+m.getValue());
	  }
	  map.putIfAbsent(6, "Aroop");
	  map.putIfAbsent(4, "Anoop");
	  System.out.println("Length of the map after putifabsent :" + map.size());
	   System.out.println("Iterating Hashmap...");  

	  for(Map.Entry m : map.entrySet())
	  {
		  System.out.println(m.getKey()+" "+m.getValue());
	  }

    }
	@Test
	public void listOfStudents()
	{
		ArrayList<Integer> studentNumbers = new ArrayList<Integer>();
		studentNumbers.add(22);
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Nag");
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student(22,"Ram",550);
		Student s2 = new Student(25,"Ramu",580);
		Student s3 = new Student(28,"Ramesh",590);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s3);
		students.add(new Student(38,"Raj",595)); //Run time object / Ananymous object		
		for(int i=0;i<students.size();i++) // i=0 means first student - s1.number ,s1.name , s1.marks
		{
			System.out.println("Student Number :" + i);
			System.out.println(students.get(i).number);  // i=0 means s1.number : i=1 means s2.number : i=2 means s3.number
			System.out.println(students.get(i).name); // i=0 means s1.name : i=1 means s2.name : i=2 means s3.name
			System.out.println(students.get(i).marks); // i=0 means s1.marks : i=1 means s2.marks : i=2 means s3.marks
		}
	}

	


class Student  // Here Student itself is a type
{
	int number;
	String name;
	int marks;
	Student(int num,String myname,int mymarks)
	{
		number = num;
		name = myname;
		marks = mymarks;
	}
}
}
