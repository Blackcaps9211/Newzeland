package javapractice;

public abstract class AbstaractAccessmodifier1 {
	
	public abstract void math1();
	public abstract void math2();
	public void math3() {
		int a =10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
	}
	

}

class AbstractaccessModifier2 extends AbstaractAccessmodifier1{

	@Override
	public void math1() {
		int x = 20;
		int y = 30;
		int z = x*y;
		System.out.println(z);
	}

	@Override
	public void math2() {
		System.out.println("math2");
	}
	
}