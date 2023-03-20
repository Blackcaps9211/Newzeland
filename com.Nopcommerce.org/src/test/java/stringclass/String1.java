package stringclass;

public class String1 {

	public static void main(String[] args) {

		
	// Aproch1 Way1	
		
	String x ="abc";	
	String b = "def";	
		String c = x+b;
		System.out.println(c);
	
		// Aproch1 Way2	
		String s1 = "Veeru";
		String s2 = "Kalluri";
	String s3 =	s1.concat(s2);
	System.out.println(s3);
		
	// Aproch2	
		
		String str1 = new String("Chef");
		str1.concat("veeru");
		System.out.println(str1);
		
		
		
		
	// Aproch3	
		
		StringBuffer sb1 = new StringBuffer("Chef");
		sb1.append(" Veeru");
		System.out.println(sb1);
		
	}

}
