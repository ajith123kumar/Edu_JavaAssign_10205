package class_1912;

class student
{
	int age;
	String name;
	student()
	{
		age=27;
		name="Ajith Kumar";
	}
	student(student s)
	{
		age=s.age;
		name=s.name;
		
	}
	public void show()
	{
		System.out.println("Age :"+age+" "+" Name of the Student :"+name);
	}
}
public class constructordemo_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s0 = new student();
		student s1 = new student(s0);
		s0.show();
		s1.show();

	}

}
