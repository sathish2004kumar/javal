package Week5;
public class Uncheck {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b;  // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);  // Invalid index
    }
}
