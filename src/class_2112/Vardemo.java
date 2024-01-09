package class_2112;

public class Vardemo {
	
	public int add(int a,int b)
	{
		return(a+b);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 12;
		float b= 12.525f;
		float c=a+b;
		System.out.println(c);
		c=a*b;
		System.out.println(c);
		c=a/b;
		System.out.println(c);
		c=a*a*b*b;
		System.out.println(c);
		c=(a*a)/(b*b);
		System.out.println(c);

		System.out.println(a*a+"x2 +"+2*(a+b)+"x +"+b*b);
		Vardemo v= new Vardemo();		
		System.out.println(v.add(12, 45));
		System.out.println("*****************Hello!******************\n**************World**************\n\t\topen the file");
		
		
	}
	

}
