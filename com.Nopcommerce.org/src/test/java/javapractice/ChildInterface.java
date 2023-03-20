package javapractice;

public class ChildInterface implements Interface1{
	int a =20;
	int b = 30;
	public static void main(String[] args) {
		ChildInterface CI = new ChildInterface();
		CI.add();
		CI.sub();
	}

	public void add() {
		
		System.out.println(a+b);
	}

	public void sub() {
		System.out.println(a-b);
		
	}

}
