package number_pattern;
import java.util.Scanner;
// number after squaring then, sum of the digit after squaring
public class Sum_of_square 
{
  public static void main(String args[])
  {
	  int arr[]= new int[5];
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the element");
	  int num= scan.nextInt();
	  System.out.println("Enter the element of the array is :");
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=scan.nextInt();
	  }
	  System.out.println("sum of the Square is :"+squaresum(arr,num));
		  scan.close();
  }	  
  public static int squaresum(int a[],int num)
  {
	  int sum=0;
	  int square=0;
	  for(int i=0;i<num;i++)
	  {
		  square=a[i]*a[i];
		  sum=sum+square;
	  }
	  return sum;
	  
  }
}
