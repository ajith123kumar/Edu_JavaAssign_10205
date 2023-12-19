package mycalculator;
import java.util.Scanner;

public class Calculator {
	static int a=1;
	static int b;
	static int pie=22/7;
	static String user;
	static String pass;
	static Scanner Cal = new Scanner(System.in);
	//Calculator c = new Calculator();
	void login()
	{
		while(true)
		{
			System.out.println("Enter UserName");

			user = Cal.nextLine();
			if (user.equals("Ajith"))
			{
				System.out.println("Enter Your Password");
				pass = Cal.nextLine();
				if(pass.equals("Password"))
				{
					System.out.println("Welcome to the Java Program - "+user);
					break;
				}
				else
				{
					System.out.println("The Password is wrong");
				}
			}

			else 
			{
				System.out.println("The Password is wrong");

			}
		}
	}

	void Arithmatic()
	{
		System.out.println("Enter the value of X and Y");
		int x = Cal.nextInt();
		int y = Cal.nextInt();

		if(y!=0)
		{
			int Sum = x + y;
			int Sub = x - y;
			int Mul = x * y;
			int Div = x/y;
			System.out.println("The Sum of X and Y is ="+Sum);
			System.out.println("The Difference between  X and Y is ="+Sub);
			System.out.println("The Product of X and Y is ="+Mul);
			System.out.println("The Division of X and Y is ="+Div);
		}
		else {
			System.out.println("Error Cannot Divide by Zero ");

		}

	}

	void area()
	{
		System.out.println("Enter the length and Breadth of the polygon");
		int l = Cal.nextInt();
		int b = Cal.nextInt();
		int area = l * b;
		System.out.println("Area of the polygon = "+area);
		//	System.out.println("Enter the length and Breadth of the polygon");
		System.out.println("Enter the Radius of the Circle");

		int r = Cal.nextInt();
		int Cir = pie * r * r;
		System.out.println("The Area of the Circle = "+Cir);
		int Circum = 2 * pie * r;
		System.out.println("The Circumference of the Circle="+Circum);
		int V = pie * l * b * r;
		System.out.println("The Volume of the Cone = "+V);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Java Program ");
		//Scanner Cal = new Scanner(System.in);
		Calculator c = new Calculator();

		c.login();
		System.out.println("Welcome to the Java Program Calculator ");

		System.out.println("Choose a Calculator Function ");

		System.out.println("Enter 1 for Arithmatic ");
		System.out.println("Enter 2 for Arithmatic ");
		b = Cal.nextInt();
		if(a==b)
		{

			System.out.println("Welcome to the Java Program For Arithmatic ");
			c.Arithmatic();

		}
		else
		{
			System.out.println("Welcome to the Java Program For Geomentry ");
			c.area();
		}
		System.out.println("Do you Want to Continue if yes then enter 1");
		b = Cal.nextInt();
		if(a==b)
		{
			System.out.println("Choose a Calculator Function ");

			System.out.println("Enter 1 for Arithmatic ");
			System.out.println("Enter 2 for Geomentry ");
			b = Cal.nextInt();
			if(a==b)
			{

				System.out.println("Welcome to the Java Program For Arithmatic ");
				c.Arithmatic();
				System.out.println("Thanks for Participating");

			}
			else
			{
				System.out.println("Welcome to the Java Program For Geomentry ");
				c.area();
				System.out.println("Thanks for Participating");

			}
			System.out.println("Thanks for Participating");

		}
		else
		{
			System.out.println("Thanks for Participating");
			System.exit(0);
		}


		while (true) {
			System.out.println("Scientific Calculator");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Square Root");
			System.out.println("6. Power");
			System.out.println("0. Exit");

			System.out.print("Enter your choice: ");
			int choice = Cal.nextInt();

			if (choice == 0) {
				System.out.println("Exiting the calculator. Goodbye!");
				break;
			}

			double result;

			switch (choice) {
			case 1:
				result = add();
				break;
			case 2:
				result = subtract();
				break;
			case 3:
				result = multiply();
				break;
			case 4:
				result = divide();
				break;
			case 5:
				result = squareRoot();
				break;
			case 6:
				result = power();
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				continue; // Restart the loop if the choice is invalid
			}

			System.out.println("Result: " + result);
		}

		Cal.close();
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a);
		System.out.println(++b);
	}


	private static double add() {
		//Scanner Cal = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = Cal.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = Cal.nextDouble();
		return num1 + num2;
	}

	private static double subtract() {
		//Scanner Cal = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = Cal.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = Cal.nextDouble();
		return num1 - num2;
	}

	private static double multiply() {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = Cal.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = Cal.nextDouble();
		return num1 * num2;
	}

	private static double divide() {
		// Scanner scanner = new Scanner(System.in);
		System.out.print("Enter dividend: ");
		double dividend = Cal.nextDouble();
		System.out.print("Enter divisor: ");
		double divisor = Cal.nextDouble();

		if (divisor != 0) {
			return dividend / divisor;
		} else {
			System.out.println("Error: Cannot divide by zero.");
			return Double.NaN; // Not a Number
		}
	}

	private static double squareRoot() {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		double number = Cal.nextDouble();

		if (number >= 0) {
			return Math.sqrt(number);
		} else {
			System.out.println("Error: Cannot calculate square root of a negative number.");
			return Double.NaN;
		}
	}

	private static double power() {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base: ");
		double base = Cal.nextDouble();
		System.out.print("Enter the exponent: ");
		double exponent = Cal.nextDouble();
		return Math.pow(base, exponent);
	}
}

