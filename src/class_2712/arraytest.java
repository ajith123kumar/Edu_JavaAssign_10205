package class_2712;

import java.util.Scanner;

public class arraytest {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int n = s.nextInt();
		int a[]=new int [n];
		
		System.out.println("Enter the Data");
		for(int i = 0;i<=n;i++)
		{
			a[i]=s.nextInt();
			}
		
		int b[]=new int [n];
		
		System.out.println("Enter the Data");
		for(int i = 0;i<=n;i++)
		{
			b[i]=s.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++)
		{
			System.out.println("A"+j+" ; "+a[j]);		
			
			sum=sum+a[j];
		}
		System.out.println("Sum :"+sum);		
	}

}
