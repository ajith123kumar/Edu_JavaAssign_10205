package mycalculator;

import java.util.Scanner;

public class TESTCONDITIONSTATE {
	static String name;
	
	void stat1()
	{
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the Name of the Celebrity");
		name = b.nextLine();
		
		if(name.equals("Ajith"))
		{
			System.out.println("Age of Ajith is 27");
		}
		else if(name.equals("Vijay"))
		{
			System.out.println("Age of Vijay is 52");
		}
		else if(name.equals("Dhoni"))
		{
			System.out.println("Age of Dhoni is 42");
		}
		else if(name.equals("Rajini"))
		{
			System.out.println("Age of Rajini is 72");
		}
		else if(name.equals("Kamal"))
		{
			System.out.println("Age of Kamal is 65");
		}
		else if(name.equals("Virat"))
		{
			System.out.println("Age of Virat is 32");
		}
		else
		{
			System.out.println("Not Valid Celebrity Name");
		}
		
	}
void stat2()
{
	Scanner b = new Scanner(System.in);
	System.out.println("Enter the Name of the Celebrity from the list");
	System.out.println("1. Ajith");
	System.out.println("2. Vijay");
	System.out.println("3. Dhoni");
	System.out.println("4. Rajini");
	System.out.println("5. Kamal");

	System.out.println("6. Virat");

	name = b.nextLine();

switch(name)
{
case "Ajith":
case "1":
	System.out.println("Age of Ajith is 27");
break;

case "Vijay":
case "2":

	System.out.println("Age of Vijay is 52");
break;

case "Dhoni":
case "3":

	System.out.println("Age of Dhoni is 42");
break;

case "Rajini":
case "4":

	System.out.println("Age of Rajini is 72");
break;

case "Kamal":
case "5":

	System.out.println("Age of Kamal is 65");

break;

case "Virat":
case "6":

	System.out.println("Age of Virat is 32");

break;

default:
	System.out.println("Not Valid Celebrity Name");

}
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name;
		int n=1;
		
		Scanner b = new Scanner(System.in);
		TESTCONDITIONSTATE t = new TESTCONDITIONSTATE();
		
		
		System.out.println("Please Check the condition to Check If the enter 1, Switch then enter 2");
		int a = b.nextInt();
		
		
		if(a==n)
		{
		//Scanner sc = new Scanner(System.in);
		t.stat1();
		}
		
		else
		{		
			t.stat2();
		}
	
	}
}
