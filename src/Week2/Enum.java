package Week2;

import java.util.Arrays;

enum Subject{
	TAMIL,
	ENGLISH,
	MATHS,
	PHYSICS,
	CHEMISTRY,
	COMPUTERSCIENCE
}
public class Enum{
	public static void main(String[] args) {
		Subject s = Subject.valueOf("COMPUTERSCIENCE");
		System.out.println(s);
		System.out.println(Arrays.toString(Subject.values()));
		
	}
	
}
