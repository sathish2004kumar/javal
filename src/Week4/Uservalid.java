package Week4;
import java.io.*;

import java.util.Scanner;

public class Uservalid {
	public static void main(String[] args) throws IOException {
		String choice="Y";
		File f = new File("cor.txt");
		FileWriter write = new FileWriter(f);
		while (choice.equalsIgnoreCase("Y"))
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("name");
		String name = sc.next();
		System.out.println("password");
		String pass = sc.next();
		if(pass=="123")
		{
			write.append(name);	
			}
		System.out.println("Y/N");
		choice = sc.next();
	}
	write.close();
	}
}