package class_050124;

public class Stringconstructer {
	int rno;
	String name;
	float avg;

	Stringconstructer()
	{
		rno = 100;
		name="Ajith Kumar";
		avg = 99.56f;
	}
	public void std()
	{
		System.out.println("Student Name \t\t:\t"+name);
		System.out.println("Student RollNo \t\t:\t"+rno);
		System.out.println("Student Average \t:\t"+avg);
	}
	public static void main(String[] args) {
		Stringconstructer s = new Stringconstructer();
		s.std();

	}

}
