package inheritance;
// Example of Hierarchical Inheritance
public class Inheritance
{
  void intro()
  {
	  System.out.println("Inheritance:");
  }
}
class multivalued extends Inheritance
{
	void det()
	{
		System.out.println("Multivalued inheritance is a type of inheritance");
	}
}
class hierarchical extends Inheritance
{
	void inf()
	{
		System.out.println("Hierarchical inheritance is a type of inheritance");
	}
	public static void main(String args[])
	{
		hierarchical ob = new hierarchical();
		ob.intro();
		ob.inf();
		
	}

}
