
class A{
		public int num=1;
		void display() {
			System.out.println("Public");
		}
	}
	class B{
		private int num1=1;
		void display1() {
			System.out.println("Private");
		}
		
	}
	class C{
		protected int num2=1;
		void display2() {
			System.out.println("Protected");
		}
		
	}
	class D{
		int num3=1;
		void display3() {
			System.out.println("Default");
		}
		
	}

public class AccessModifier {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.display();
		B b=new B();
		b.display1();
		C c=new C();
		c.display2();
		D d=new D();
		d.display3();

	}

}
