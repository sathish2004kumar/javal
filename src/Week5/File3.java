package Week5;
import java.io.FileWriter;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is a Java file writing example.\n");
            writer.write("File writing completed successfully.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
