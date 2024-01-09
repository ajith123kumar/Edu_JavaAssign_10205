package class_2812;

import java.util.Scanner;

public class TypesofVariables {
	
	int id,sal;
	String name,mob,desig,dept,mail,add;
	void input()
	{
		Scanner s = new Scanner(System.in);
		TypesofVariables t = new TypesofVariables();
		System.out.println("Enter ID");
		t.id=s.nextInt();
		System.out.println("Enter Name");
		t.name=s.next();
		System.out.println("Enter Designation");
		t.desig=s.next();
		System.out.println("Enter Department");
		t.dept=s.next();	
		System.out.println("Enter mail");
		t.mail=s.next();
		System.out.println("Enter address");
		t.add=s.next();
		System.out.println("Enter salary");
		t.sal=s.nextInt();
	}
	void output()
	{
		TypesofVariables t = new TypesofVariables();
		System.out.println("ID\t: "+t.id+"\nName\t:"+t.name+"\nDesignation\t:"+t.desig+"\nDepartment\t:"+t.dept+"\nEmailID\t:"+t.mail+"\nAddress\t:"+t.add+"\nSalary\t:"+t.sal);
	}
	public static void main(String[] args) 
	{
		TypesofVariables t = new TypesofVariables();
		t.input();
		t.output();

	}

}
