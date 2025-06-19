package Week5;

class Person { 
    // Default constructor
    Person() { 
        System.out.println("No name"); 
    } 

    // Parameterized constructor
    Person(String name) { 
        System.out.println("Name: " + name); 
    } 
}

public class cons {
    public static void main(String[] args) { 
        new Person();           // Output: No name
        new Person("Kumar");    // Output: Name: Kumar
    }
}
