package class_2712;

import java.util.Scanner;

public class arraycomp {
	static int findMaxValue(int[] a) 
	{
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		arraycomp arr = new arraycomp();
		System.out.println("Enter the Size of the Array");
		int n = s.nextInt();
		int a[]=new int [n];
	
		System.out.println("Enter the Data");
		for(int i = 0;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
        int max = findMaxValue(a);
        System.out.println("Maximum value in the array: " +max);


	}

}
