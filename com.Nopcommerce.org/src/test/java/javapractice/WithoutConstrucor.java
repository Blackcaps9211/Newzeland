package javapractice;

public class WithoutConstrucor {
	
	
	public void addMethod() {
		
		int a =20;
		int b = 30;
		System.out.println(a+b);
	}
	
	public void stringMethod() {
		
		String s1 = "veeru";
		String s2 = "kalluri";
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		
		WithoutConstrucor wc = new WithoutConstrucor();
		
		wc.addMethod();
		wc.stringMethod();

	}

}
