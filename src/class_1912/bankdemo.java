package class_1912;

class bank
{
	private int accno;
	private String accname;

	bank()
	{
		accno=1001;
		accname="Ajith Kumar";
	}
	public void showbank()
	{
		System.out.println("Accno: "+accno+" - "+"Acc Name :"+accname);
	}
}
class parabank
{
	private int accno1;
	private String accname1;
	parabank(int accno,String accname)
	{
		accno1=accno;
		accname1=accname;
	}
	public void showbank1()
	{
		System.out.println("Accno: "+accno1+" - "+"Acc Name :"+accname1);
	}

}

public class bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b = new bank();
		b.showbank();
		bank b2 = new bank();
		b2.showbank();
		parabank pb = new parabank(101,"Ajith");
		pb.showbank1();
		parabank pb1 = new parabank(123,"Dhoni");
		pb1.showbank1();

	}

}
