package Week5;

public class Out {
	int outData = 1000;
	class inner{
		void display() {
			System.out.println("Out data is:"+outData);
		}
	}
	public static void main (String[] args) {
		Out o = new Out();
		
		Out.inner i = o.new inner();
		i.display();
		
	}

}
