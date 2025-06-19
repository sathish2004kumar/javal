package Week5;

import java.io.*;

public class Check {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt"); // File might not exist
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found or error while reading: " + e.getMessage());
        }
    }
}
