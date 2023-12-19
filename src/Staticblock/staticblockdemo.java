package Staticblock;
class statblock
{
	int x;
	//	x = 1253;

	static int y;
	static
	{
		//		x=23; because error will show
//		y=100;
		System.out.println("This is the Static Block");
		//		show();because error will show
		display();
	}


void show()
{
	statblock s= new statblock();
	s.x=123;
	System.out.println("The Show class called x "+x);
	display();

}
static void display()
{
	System.out.println("The Display is called y "+y);
}
}
public class staticblockdemo
{

	public static void main(String[] args)
	{
		statblock b = new statblock();	
		b.y=12354;
		b.show();
		int[] sparseArray = {1, 0, 0, 4, 0, 6};

        for (int value : sparseArray) 
        {
            System.out.print(value + " ");
        }

	}

}

