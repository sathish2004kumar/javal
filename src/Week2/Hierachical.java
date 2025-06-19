package Week2;

//public class Hierachical {
class Animal
{
	void eat() {
		System.out.println("I can eat");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog bark");
	}
}
class cat extends Animal{
	void meow() {
		System.out.println("cat meow");
	}
}
public class Hierachical
{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		cat c = new cat();
		c.eat();
		c.meow();
	}
}

