package class_0901_inheritance;

class animal
{
	public void weep()
	{
		System.out.println("Dog is Weeping");
	}
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}
class dog extends animal
{
	public void walk()
	{
		System.out.println("Dog is Walking");
	}
	public void run()
	{
		System.out.println("Dog is Running");
	}
}
class cat extends dog
{
	public void walk1()
	{
		System.out.println("Cat is Walking");
	}
	public void sleep()
	{
		System.out.println("Cat is Sleeping");
	}
}
public class Multilevinheritance 
{

	public static void main(String[] args) 
	{
		cat a = new cat();
		dog b = new dog();
		animal c = new animal();
		a.walk();
		a.walk1();
		a.weep();
		a.bark();
		a.run();
		a.sleep();
		b.walk();
		c.weep();
		c.bark();
		
		
	}

}
