package oops;
// Method overloading basic
class Test_1 
{
	void show(int a, String s)
	{
		System.out.println("1");
	}
	void show(String a, int b)
	{
		System.out.println("2");
	}
	public static void main(String args[])
	{
		Test_1 ob= new Test_1();
		ob.show(10,"abc");
		ob.show("anmol",10);
		
	}
	

}
