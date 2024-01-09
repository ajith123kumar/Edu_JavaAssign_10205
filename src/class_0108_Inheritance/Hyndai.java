package class_0108_Inheritance;

class car
{
public void run()
{
System.out.println("Car in Running");
}

public void brake()
{
System.out.println("Car in Stopped");
}

}
class hyn extends car
{
	public void gears()
	{
		System.out.println("New feature added to Car");
	}
}

public class Hyndai {
	
	
	public static void main(String[] args) 
	{
		hyn c = new hyn();
		c.run();
		c.brake();
		c.gears();
	}

}
