package array;

import org.junit.Test;
//array having random number and separating the Element which one is Even and which one is Odd
public class EvenOdd {

	@Test
	public void evenOdd()
   {
	int[] numbers= {22,21,26,28,29,37,34,35,38,39,43,45,47,48,54,56,58,52};
    int len=numbers.length;
    int[] a= new int[len];
    int[] b= new int[len];
    int countEven = 0;
    int countOdd = 0;
    
    for(int i=0;i<len;i++) //Looping statement
    {       
     for(int j=countEven;j<len;j++)
     {
       if(numbers[i]%2==0) //conditional statement
        {
            a[j]=numbers[i];
            countEven++;
            break;
        }
      }   

     for(int j=countOdd;j<len;j++)
     {
       if(numbers[i]%2!=0)
        {

            b[j]=numbers[i];
            countOdd++;
            break;
       }
     }
    }

    System.out.println("All the even numbers in array are:");
    for(int k=0;k<a.length;k++)
    {
    System.out.print(" " +a[k]);
    }

    System.out.println();
    
    System.out.println("All the odd numbers in array are:");
    for(int m=0;m<b.length;m++)
    {
    System.out.print(" " +b[m]);
    
    
    }
   }

}
