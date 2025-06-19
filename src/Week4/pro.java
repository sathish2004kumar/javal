package Week4;
public class pro{
	void propagation() {
		try {
			s1();
				}
		catch (Exception p){
	
		System.out.println("please check for status");
		}
	}
	void s1() {
		s2();
		System.out.println("Transaction successful");
	}
	void s2() {
		System.out.println(10/0);
		System.out.println("Entry your passbook");
	}
	public static void main(String[] args){
		pro s = new pro();
		s.propagation();
	
}
}