package Week2;
abstract class player{
	abstract void team();
	 void cricket() {
		System.out.println("The cricket player");
	}
}
class Dhoni extends player{
	 void team() {
		System.out.println("Dhoni is an Indian team player");
		
	}
	
}
class Buttler extends player{
	void team() {
		System.out.println("Buttler is an England team player");
	}
}
public class Abstract{
	public static void main(String[] args) {
		player a1 = new Dhoni();
		player a2 = new Buttler();
		a1.cricket();
		a1.team();
		a2.cricket();
		a2.team();
		
	}
}

