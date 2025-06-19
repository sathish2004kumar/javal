package Week5;
class Car { 
    // properties (fields) 
    String color; 
    int speed; 
 
    // behavior (method) 
    void drive() { 
        System.out.println("Car is driving"); 
    }
}
public class Cars{ 
    public static void main(String[] args) { 
        Car myCar = new Car(); // Object                
        myCar.color = "Red"; 
        myCar.speed = 80; 
 
        System.out.println(myCar.color); // Output: Red 
        myCar.drive(); // Output: Car is driving 
    } 
}


 


   