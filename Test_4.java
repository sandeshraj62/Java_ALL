package oops;

class Test_4
{  
	void show(int a)
	 {
		System.out.println("int method");
	}
	void show(float a)
	{
		System.out.println("String method");
	}
	public static void main(String args[])
	{
		Test_4 t= new Test_4();
		t.show(10f);
		t.show(0);
	}

}
