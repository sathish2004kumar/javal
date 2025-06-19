package Week4;
class Car{
	String model;
	Car (String model)
	{
		this.model = model;
	}
	void showmodel()
	{
		System.out.println("Car model:" + model);
	}
}
	public class Gar{
		public static void main(String[] args)
		{
			Car c1 = new Car("BMW");
			Car c2 = new Car("Audi");
			c1 . showmodel();
			c2 . showmodel();
			c1 = new Car("Tesla");
			c1 . showmodel();
		}
	
}
