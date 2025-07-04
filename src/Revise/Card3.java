package Revise;

class car{
	 void show() {
		System.out.println("car details");
	}
}
	class BMW extends car{
		 void show() {
			System.out.println("BMW - 50 lakhs");
		}
	}
	class Audi extends car{
		void show() {
			System.out.println("Audi - 30 lakhs");
		}
	}
	class Kia extends car{
		void show() {
			System.out.println("Kia - 20 lakhs");
		}
	}
public class Card3 {

	public static void main(String[] args) {
	car c1 = new BMW();
	c1.show();
	car c2 = new Audi();
	c2.show();
	car c3 = new Kia();
	c3.show();
	}

}
