package oops;
// Method Overloading basic
class Test 
{
  void show(int a)  //  no of argument =1;
  {
	  System.out.println("1");
  }
  void show()      // //  no of argument =0;
  {
	  System.out.println("2");
  }
  public static void main(String args[])
  {
	  Test t= new Test();
	  t.show(10); // 1
	  t.show();   // 2
  }
  
}
