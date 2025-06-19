package Week5;

interface Animalss { 
    void sound();  // abstract method 
} 
 
class Cat implements Animalss { 
    public void sound() { 
        System.out.println("Meow"); 
    } 
} 
class Tiger implements Animalss { 
    public void sound() { 
        System.out.println("Roar"); 
    } 
} 
 
public class Inter { 
    public static void main(String[] args) { 
        Cat c = new Cat(); 
        c.sound(); 
        Tiger t = new Tiger();
        t.sound();// Meow 
    } 
} 