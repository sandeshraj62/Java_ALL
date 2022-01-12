package inheritance;
// Example of MultiLevel Inheritance
class Animal 
{
  void EAT()
  {
	  System.out.println("EAT");
  }
}
class dog extends Animal
{
	void speak()
	{
		System.out.println("Barking");
	}
}
class puppies extends dog
{
	void meow()
	{
		System.out.println("meowing");
	}
	public static void main(String args[])
	{
		puppies ob = new puppies();
		ob.EAT();
		ob.speak();
		ob.meow();
			}
}
