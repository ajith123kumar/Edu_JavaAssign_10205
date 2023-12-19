package mycalculator;

import java.util.Scanner;

public class powerseries {
	static int n;

	void sum()
	{
		for(int i=0;i<=n;i++)
		{

			System.out.println(i);

		}
	System.out.println();

	}
	void sumsq()
	{
		for(int i=0;i<=n;i++)
		{

			System.out.println(i*i +"");

		}
		System.out.println();


	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome Series JAVA Program");
		Scanner s = new Scanner(System.in);
		powerseries p = new powerseries();
		System.out.println("Enter the Terms of the Series");
		n = s.nextInt();
		p.sum();
		p.sumsq();


	}

}
