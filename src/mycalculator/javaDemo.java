package mycalculator;

import java.util.Scanner;

public class javaDemo {
	
	void incremantoperator() 
	{
		int x=10;
		int a;
		System.out.println(x);

		x++;
		System.out.println(x);
	    System.out.println(x++);
	    System.out.println(x);
	    System.out.println(++x);
	    System.out.println(++x + " " + x + " " +x++ + " " + ++x);
	    System.out.println(++x + " " + --x + " " + x + " " + ++x);
		System.out.println(++x + x + --x + x++ + x);
		System.out.println("The Product" + x * ++x);
		
//		a+=12;
		
//		System.out.println(a);
	}
	
	void ifelse() {
		int vid,aadhar,pan;
		int c;
//		String Id;
		vid = 1234;
		aadhar = 11111;
		pan = 12345;
		Scanner b = new Scanner(System.in);
		System.out.println ("Select the Id card");
		System.out.println ("VoterID");
		System.out.println ("Aadhar");
		System.out.println ("PAN");

		String Id = b.nextLine();
		
		switch(Id)
		{
		case "VoterID":
			System.out.println("Please enter your VoterID no");
			vid = b.nextInt();
			if(vid==1234)
			{
				System.out.println("You can cast Vote with VoterID");
			}
			else
			{
				System.out.println("You can't cast Vote");
			}
			break;
			
		case "Aadhar":
			System.out.println("Please enter your Aadhar no");
			aadhar = b.nextInt();
			if(aadhar==1234)
			{
				System.out.println("You can cast Vote with Aadhar Number");
			}
			else
			{
				System.out.println("You can't cast Vote");
			}
			break;
			
		case "PAN":
			System.out.println("Please enter your Pan no");
			aadhar = b.nextInt();
			if(pan==1234)
			{
				System.out.println("You can cast Vote with PAN Number");
			}
			else
			{
				System.out.println("You can't cast Vote");
			}
			break;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Program");
		
javaDemo D = new javaDemo();
D.incremantoperator();
//Scanner b = new Scanner(System.in);

D.ifelse();

	}

}
