package Week6;
public sealed class Animal permits Dog{
	void sound() {
		System.out.println("The animals sound");
	}
}

final class Dog extends Animal {
	void sound() {
		System.out.println("Dog is bark");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
