package class_1912;

class human
{
	human(){};
	human(int hid,String hname)
	{
		System.out.println("Human id No: "+hid+""+" Human Name : "+hname);
	}
	human(int hid)
	{
		System.out.println("Human id No: "+hid);
	}
	human(String hname)
	{
		System.out.println("Human Name : "+hname);
		
	}
}
public class constructoroverloading 
{
	public static void main(String[] args) 
	{
		human h = new human();
		human h0 = new human(100,"Ajith Kumar");
		human h1 = new human(100);
		human h2 = new human("Ajith Kumar");
	}

}
