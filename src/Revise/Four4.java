package Revise;

class A{
	void show() {
		System.out.println("A class");
	}
}
class B extends A{
	void show() {
		System.out.println("B class");
	}
}
class C extends B{
	void show() {
		System.out.println("C class");
	}
}
class D extends C{
	void show() {
		System.out.println("D class");
	}
}
public class Four4 {

	public static void main(String[] args) {
		A obj3 = new A();
		B obj = new B();
		C obj1 = new C();
		D obj2 = new D();
		obj1.show();
		obj2.show();
		obj3.show();
		obj.show();
	}

}
