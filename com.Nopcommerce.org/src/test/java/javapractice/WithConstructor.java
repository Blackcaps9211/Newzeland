package javapractice;

public class WithConstructor {
	
	public WithConstructor(int a,int b,int c) {
		
		System.out.println(a*b*c);
	}
	
	public WithConstructor(String s1, String s2) {
		
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		
		WithConstructor CW = new WithConstructor(10,20,30);
		WithConstructor CW1 = new WithConstructor(40,30,70);
		WithConstructor cw = new WithConstructor("veeru","kalluri");

	}

}
