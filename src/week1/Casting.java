package week1;

public class Casting {
    public int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Casting obj = new Casting();         // Create an object
        int result = obj.add(10, 20);        // Call method
        System.out.println("Sum: " + result);
        
    }
}
