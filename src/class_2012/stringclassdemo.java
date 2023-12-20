package class_2012;

public class stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a = new StringBuilder("Ajith Kumar");
		StringBuilder b = new StringBuilder("Ajith Kumar");
		
		a.append("JAVA");
		
		System.out.println("Length :"+a.length());
		System.out.println("Char at 5th location :"+a.charAt(6));
		System.out.println("Length :"+b.length());
		System.out.println("Char at 8th location :"+b.charAt(8));
		System.out.println("Storage :"+a.hashCode());
		System.out.println("Storage :"+b.hashCode());
		
		String s1 = "Chennai";
		String s2 = "Madurai";
		
		System.out.println("Char at 3 position:"+s1.charAt(3));
		System.out.println("Char at 3 position:"+s1.charAt(3));
		
		String s3;
		
		s3=s1.concat(s2);
		System.out.println(s3);
		
		s3=s3.replace("e","e");
		System.out.println(s3);
		
		s3=String.copyValueOf(s2.toCharArray());
		System.out.println(s3);	
		
		
		int c;
				c=s2.compareTo(s3);
		if(c<0)
			System.out.println("S2 is less than S3");
		else if(c==0)
			System.out.println("S2 is equal to S3");
		else
			System.out.println("S2 is greater than S3");
		
		s3=s1.toUpperCase();
		System.out.println(s3);
		
		int fin, lin;
		fin = s1.indexOf("n");
		System.out.println("first index of n in s1 is "+fin);

		lin = s1.lastIndexOf("n");
		System.out.println("last index of n in s1 is "+lin);
		
		String s;
		s = s1.substring(fin,lin+1);
		System.out.println("Substring : "+s);
	
		int i =10;
		float f = 9.8f;
		s3=String.format("Value of i = %d Value of f = %f",i,f);
		System.out.println(s3);
	}

}
