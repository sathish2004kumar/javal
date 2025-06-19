package Week4;
import java.util.Scanner;
public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		System.out.println(n);
		sc.nextLine();
		System.out.println("Enter any name");
		String s = sc.next();
		System.out.println(s);
	}

}
