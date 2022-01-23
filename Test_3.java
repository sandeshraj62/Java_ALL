package oops;
// can we override the main method
class Test_3 
{
	 public static void main(String args[])
	 {
		 System.out.println("1");
		Test_3 ob = new Test_3();
		ob.main(10);
	 }
	 
     public static void main(int a)
	 {
		System.out.println("2");
	}
 }
// yes we can override the main method