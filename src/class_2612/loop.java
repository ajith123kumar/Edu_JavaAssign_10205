package class_2612;
import java.util.Scanner;


public class loop {


	void mult()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Multiplication Table");
		System.out.println("Enter the Table number:");
		int n=s.nextInt();
		System.out.println("Enter the Table Term:");
		int j=s.nextInt();
		System.out.println("Multiplication Table of : "+n);		

		for(int i=1;i<=j;i++)
		{
			System.out.println(n+" X "+i+" = "+(i*n));			
		}
	}
	void rev()
	{
		//		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		//		System.out.println("Enter the number:");
		int n1 = s.nextInt();
		int rev=0;
		while(n1!=0)
		{
			int rem=n1%10;
			rev=rev*10+rem;
			n1=n1/10;
		}
		System.out.println("Reverse: "+rev);
	}
	void fact()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		int fact = n * (n+1)/2;
		System.out.println("Factorial of the number "+n+" is "+fact);


	}
	void fib()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of terms:");

	        int i;
	        int j;
	        int n;
	        int k;
	        int l;
	        System.out.println("Enter the number of terms for Fibonacci series:");
	        n = s.nextInt();
	        System.out.println("Fibonacci Series:");

	       
	        	j=0;
	        	k=1; 
	        	for (i = 0; i < n; i++) 
	            {
	            System.out.print(j + " ");

	            l = k + j;
	            j = k;
	           k = l;
	        }
	}
	void matrix()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of Rows in the Matrix");
		int m=s.nextInt();
		System.out.println("Enter the Number of Columns in the Matrix");
		int n=s.nextInt();
		int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.println(matrix[i][j]);
            }
//            System.out.println();
        }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner s = new Scanner(System.in);
		loop l = new loop();
		System.out.println("Welcome to number works :");
		System.out.println("Select Option :\n1.Multiplication\n2.Reverse\n3.Factorial\n4.Fibbonocci\n5.Matrix");
		int c = s.nextInt();
		do
		{
			switch(c)		
			{
			case 1:
				System.out.println("Welcome to Multiplication :");

				l.mult();
				break;
			case 2:
				System.out.println("Welcome to Reverse :");
				System.out.println("Enter the number:");
				l.rev();
				break;
			case 3:
				System.out.println("Welcome to Factorial :");
				l.fact();
				break;
			case 4:
				System.out.println("Welcome to Fibbonocci Series :");
				l.fib();
				break;
			case 5:
				System.out.println("Welcome to Matrix :");
				l.matrix();
				break;
			default:
				System.out.println("Enter valid Selection");
			}
			System.out.println("\nEnter Yes if you want to continue");
			s.nextLine();
			input = s.next();

		}while(input.equalsIgnoreCase("Yes"));
	}

}
