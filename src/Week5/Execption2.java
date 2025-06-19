package Week5;
public class Execption2 { 
    static void checkAge(int age) { 
        if (age < 18) { 
            throw new ArithmeticException("You must be at least 18 years old."); 
        } else { 
            System.out.println("Access granted."); 
        } 
    } 
 
    public static void main(String[] args) { 
        checkAge(20);  // Exception thrown here 
    } 
} 