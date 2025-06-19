package Week5;
class MyException extends Exception { 
    MyException(String message) { 
        super(message); 
    } 
} 
 
public class Custom { 
    static void validate(int age) throws MyException { 
        if (age < 18) { 
            throw new MyException("Age should be 18 or above"); 
        } else { 
            System.out.println("Valid age"); 
        } 
    } 
 
    public static void main(String[] args) { 
        try { 
            validate(15); 
        } catch (MyException e) { 
            System.out.println("Caught exception: " + e.getMessage()); 
        } 
    } 
} 