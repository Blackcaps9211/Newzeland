package javapractice;
public class StaticExample1 {
	public static void method1() {
		System.out.println("This is static method1");
	}
	public void method2() {
		StaticExample1.method1();
	}
	public static void method3() {
		StaticExample1.method1();
	}
	public static void main(String[] args) {
		StaticExample1.method1();
		StaticExample1.method3();
		StaticExample1 se1 = new StaticExample1();
		se1.method2();
		System.out.println(StaticExample1.StaticExample2.a);
	}
	static class StaticExample2 {
		static int a = 20;
	}
}
