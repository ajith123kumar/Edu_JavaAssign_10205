package class_2812;

public class newyear {
	void line1()
	{
		System.out.println("------------------------------------------------------------------");
	}
	void countdown()
	{
		newyear n=new newyear();
		for(int i =10;i>=1;)
		{
			
			n.Fireworks();
			n.Fireworks2();
			System.out.println("\t");
			i--;
		}
		
	
	}
	void wish()
	{
		System.out.println("\t\tHappy New Year 🎉🎉🎉");
			
	}
	public void Fireworks() {
        System.out.println("        *  *  *  *         ");
        System.out.println("       *  *  *  *  *        ");
        System.out.println("        *  *  *  *         ");
        System.out.println("       *  *  *  *  *        ");
    }
	public void Fireworks2() {
        System.out.println("\t\t        *  *  *  *         ");
        System.out.println("\t\t       *  *  *  *  *        ");
        System.out.println("\t\t        *  *  *  *         ");
        System.out.println("\t\t       *  *  *  *  *        ");
    }

	public static void main(String[] args) 
		{
		newyear n=new newyear();
		
		n.countdown();
		n.Fireworks();
		n.Fireworks2();
		n.line1();
		n.wish();
		n.line1();
		n.countdown();
		n.Fireworks();
		n.Fireworks2();
		
	}

}
