package Week5;

public class Proo { 
    static void method1() { 
        method2(); 
    } 
 
    static void method2() { 
        int a = 5 / 0;  // ArithmeticException here 
    } 
 
    public static void main(String[] args) { 
        try { 
            method1(); 
        } catch (ArithmeticException e) { 
            System.out.println("Exception caught in main method: " + e.getMessage()); 
        }
    }
}
    