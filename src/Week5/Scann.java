package Week5;
import java.util.Scanner; 
 
public class Scann { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);                           
 
        System.out.print("Enter your name: "); 
        String name = sc.nextLine(); 
 
        System.out.print("Enter your age: "); 
        int age = sc.nextInt(); 
 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
 
        sc.close();  // Scanner                   
    } 
} 



//nextLine()string       
//nextInt() Integer input       
//nextDouble() Double input       
//next() Single word input      