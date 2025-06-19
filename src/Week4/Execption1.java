package Week4;
public class Execption1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number 0 cannot be used for division.");
        } finally {
            System.out.println("This program is closed.");
        }
    }
}
