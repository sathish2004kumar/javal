package Week5;

abstract class Animals { 
    abstract void sound();  // abstract method - no body 
 
    void sleep() { 
        System.out.println("Animal is sleeping"); 
    } 
} 
 
class Dogs extends Animals { 
    void sound() { 
        System.out.println("Dog barks"); 
    } 
} 
 
public class Abs { 
    public static void main(String[] args) { 
        Dogs d = new Dogs(); 
        d.sound();  // Dog barks 
        d.sleep();  // Animal is sleeping 
    } 
}