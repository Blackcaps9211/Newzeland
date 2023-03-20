package javapractice;

public class ConsructorPractice {            // ConsructorPractice without constructor 6 to 20
	
	
//	public void methodc1() {
//		
//		//int a = 101;
//		//String b = "Veeru";
//		System.out.println("roll no : 101");
//		System.out.println("Veeru");
//	}
//
//	public static void main(String[] args) {
//
//		ConsructorPractice cp = new ConsructorPractice();
//		
//	cp.methodc1();
//		
//	}

	
	public ConsructorPractice( int rollno,String name) {
		
		 System.out.println(rollno +" ");
		 System.out.println(name);
		
	
		
	}
	
	public static void main(String[] args) {
		
		ConsructorPractice cp1 = new ConsructorPractice(101,"Veeru");
		ConsructorPractice cp2 = new ConsructorPractice(102,"Anji");
		
		 System.out.println(cp1);
		 System.out.println(cp2);
		
	}
	
	
}
