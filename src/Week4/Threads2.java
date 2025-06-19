package Week4;

public class Threads2 extends Thread {
	static int i=5;
	public void run()
	
	{
	
	}
	public static void main(String[] args) {
		Threads2 t = new Threads2();
		t.start();
		System.out.println("Start the game");
		System.out.println(i);
		System.out.println(i);
		i--;
		System.out.println(i);
		System.out.println(i);
		i++;
		System.out.println(i);
		System.out.println("End of game");
		
	}

}
