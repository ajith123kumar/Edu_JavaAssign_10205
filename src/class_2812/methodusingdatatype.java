package class_2812;

public class methodusingdatatype {
	public int div(int a,int b)
	{
		return(a/b);
	}
	public int mul(int x, int y)
	{
		return(x*y);
	}

	public static void main(String[] args) 
	{
		methodusingdatatype m = new methodusingdatatype();
		System.out.println("Div : "+m.div(255486,5678));
		System.out.println("Div : "+m.mul(255486,5678));
		method m1 = new method();
		m1.add(12453, 123);
		m1.sub();
		
		

	}

}
