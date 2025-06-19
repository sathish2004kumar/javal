package Week4;
import java.io.*;
import java.util.Scanner;
public class Filea {
    public static void main(String[] args) {
        try {
            File f = new File("cor.txt");
            FileWriter writer = new FileWriter(f);
            writer.write("admin 123");
            writer.close();
            Scanner fScanner = new Scanner(f);
            String storedUsername = "";
            String storedPassword = "";
            if (fScanner.hasNext()) {
                storedUsername = fScanner.next();
            }
            if (fScanner.hasNext()) {
                storedPassword = fScanner.next();
            }
            fScanner.close();
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Enter username:");
            String inputUsername = inputScanner.next();
            System.out.println("Enter password:");
            String inputPassword = inputScanner.next();
            inputScanner.close();
            if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)) {
                System.out.println("Valid user");
            } else {
                System.out.println("Invalid user");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
