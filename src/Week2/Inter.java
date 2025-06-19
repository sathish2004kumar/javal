package Week2;
interface A3{
	int a = 30;
	void b1();
	default void b2() {
	}
	}
	interface C{
		void b3(); 
	}
	public class Inter implements A3,C {
		//public static void main(String[] args) {
		int a = 35;
				public void b1() {
		System.out.println(A3.a);
		}
		
				@Override
				public void b2() {
					//int a = 40;
					System.out.println(a);
					
				}
				@Override
				public void b3() {
					System.out.println(a);
					}
	
	public static void main(String[] args) {
		Inter a = new Inter();
		a.b1();
		a.b2();
		a.b3();
		
	}
	}
	