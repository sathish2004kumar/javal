package Week4;

import java.util.Scanner;

enum Subject{
java,
python,
html
}
public class Excepro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			while(true) {
			try {
				System.out.println("Enter subject");
				int subject = sc.nextInt();
				break;
				}
			catch(Exception e) {
				e.printStackTrace();
				sc.next();
				
			}
		}
			}
}