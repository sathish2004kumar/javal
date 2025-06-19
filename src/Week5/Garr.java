package Week5;

import Week5.Carss;

class Carss{
	String model;
	Carss (String model)
	{
		this.model = model;
	}
	void showmodel()
	{
		System.out.println("Car model:" + model);
	}
}
	public class Garr{
		public static void main(String[] args)
		{
			Carss c1 = new Carss("BMW");
			Carss c2 = new Carss("Audi");
			c1 . showmodel();
			c2 . showmodel();
			c1 = new Carss("Tesla");
			c1 . showmodel();
		}
	
}
