package prepinsta;
import java.util.Scanner;
// Reversing of the number 
class Reverse_the_number
{
   public static void main(String args[])
   {
	   Scanner s= new Scanner(System.in);
	   System.out.println("Enter the number ");
	   int number=s.nextInt();
	   int reverse=0;
	   while(number!=0)
	   {
		  int rem=number%10;
		  reverse = reverse*10 + rem;
		  number=number/10;
	   }
	   System.out.println("Reverse of the number is :"+reverse);
	   s.close();
   }
}
