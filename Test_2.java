package oops;

class Test_2 
{
   void show(int a)
   {
	 System.out.println("1");
   }
   void show(String a)
    {
	 System.out.println("2");
    }
   public static void main(String args[])
   {
	Test_2 ob= new Test_2();
	ob.show(10);
	ob.show("anmol");
	}
}