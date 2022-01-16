package number_pattern;
import java.util.Scanner;
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class Number_pattern_2
{
  public static void main(String args[])
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the row:");
	  int n= scan.nextInt();
	  for(int i=n;i>=0;i--)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
	  scan.close();
  }
}
