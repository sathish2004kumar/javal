package Week5;
class Animal { 
void sound() { 
System.out.println("Animal makes sound"); 
} 
} 
 
class Dog extends Animal { 
    @Override 
    void sound() { 
        System.out.println("Dog barks"); 
    } 
} 
 
public class Inher { 
    public static void main(String[] args) { 
        Animal a = new Dog(); 
        a.sound(); // Output: Dog barks 
    } 
}