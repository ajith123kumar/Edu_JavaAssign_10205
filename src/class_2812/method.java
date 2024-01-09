package class_2812;

public class method {
	
	void add(int a,int b)
	{
		System.out.println("Sum : "+(a+b));
	}
	void sub()
	{
		int a=10,b=20;
		System.out.println("Sub : "+(a-b));
	}

	public static void main(String[] args) 
	{
		method m = new method();
		m.add(125, 235);
		m.sub();
	}

}
