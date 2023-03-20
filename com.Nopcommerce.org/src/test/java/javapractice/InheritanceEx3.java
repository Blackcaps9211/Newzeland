package javapractice;

 class InheritanceEx3 {
	
	
		int a = 10;
		public void method1(){
			System.out.println("old mtehod1");
		}
		
	}

	class Inheritance4 extends InheritanceEx3{
		
		public void method2(){
			System.out.println("This is Example7 class Method2");
		}
		
	}

	class Inheritance5 extends Inheritance4{
		
		public void method3(){
			System.out.println("This is Example8 class Method3");
		}
		
		
	}

	class Inheritance6 extends Inheritance5{

		public void method1(){
			System.out.println("old mtehod1 updated");
		}
		
		public static void main(String[] args){
			
			Inheritance6 in6 = new Inheritance6();
			in6.method1();
			in6.method2();
			in6.method3();
			
		}
	
	
	
	
	

}
