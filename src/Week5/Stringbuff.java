package Week5;

public class Stringbuff {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println(s1);
		s1.insert(0, "H");
		System.out.println(s1);
		s1.insert(1,"i");
		System.out.println(s1);
		s1.insert(2,"i");
		System.out.println(s1);
		s1.insert(3,"e");
		System.out.println(s1);
		s1.replace(0, 3,"Hii");
		System.out.println(s1);
		s1.delete(3, 4);
		System.out.println(s1);
		s1.delete(0, 3);
		System.out.println(s1);
	
		
		
		
		
	}
}
