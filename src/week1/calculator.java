package week1;

public class calculator {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        calculator calculator = new calculator();   // Create object
        int sum = calculator.add(50, 30);           // Addition
        int diff = calculator.subtract(50, 30);     // Subtraction

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
    }
}
