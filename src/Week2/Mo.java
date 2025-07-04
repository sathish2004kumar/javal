package Week2;

class Animales{
	void eat() {
		System.out.println("Animals are eating");
	}
}
	class Dogs extends Animales{
		void eat() {
			System.out.println("dogs are eating");
		}
	}

public class Mo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animales a = new Dogs();
		a.eat();

	}

}
