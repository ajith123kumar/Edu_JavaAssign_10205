package class_050124;

class school
{
	int rno;
	String name;
	float avg;

school(int r,String n,float av)
{
	rno=r;
	name=n;
	avg=av;
}
school(byte r,String n)
{
	rno=r;
	name=n;
}
school()
{};
public void std()
{

	System.out.println("----------------------------------------------------");
	System.out.println("Student Name \t\t:\t"+name);
	System.out.println("Student RollNo \t\t:\t"+rno);
	System.out.println("Student Average \t:\t"+avg);
	System.out.println("----------------------------------------------------");

}
}
public class constructerdemopara {

	public static void main(String[] args) {
		school s2 = new school();
		school s = new school(101,"Ajith Kumar",95.65f);
		school s1 = new school(111,"Hari Haran",90.72f);
		s.std();
		s1.std();


	}

}
