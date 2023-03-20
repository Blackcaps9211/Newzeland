package javapractice;
public class ProtectedExample1 {
	protected int a = 10;
	protected void method1() {
		System.out.println("Method1");
	}
	public static void main(String[] args) {
		ProtectedExample1 pe1 = new ProtectedExample1();
		System.out.println(pe1.a);
		pe1.method1();
	}
}
