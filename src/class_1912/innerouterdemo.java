package class_1912;

class outer{
int x=10;
	
	class inner
	{
	int y=23423;
	}
}
public class innerouterdemo 
{
	

	public static void main(String[] args) {
		outer o = new outer();
		outer.inner i=o.new inner();
		System.out.println(o.x);
		System.out.println(i.y);
		System.out.println(o.x+1);
		System.out.println(i.y+1);
		
		
	}

}
