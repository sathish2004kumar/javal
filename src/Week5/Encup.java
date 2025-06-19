package Week5;

class Student { 
	// Step 1: private variables (data hiding) 
	private String name; 
	private int age; 
	// Step 2: public setter methods (write access) 
	public void setName(String n) { 
	name = n; 
	} 
	public void setAge(int a) { 
	age = a; 
	} 
	// Step 3: public getter methods (read access) 
	public String getName() { 
	return name; 
	} 
	public int getAge() { 
	return age; 
	} 
	} 
	
	public class Encup{ 
	public static void main(String[] args) { 
	Student s1 = new Student(); 
	s1.setName("Arun"); 
	s1.setAge(20); 
	System.out.println("Name: " + s1.getName()); 
	System.out.println("Age: " + s1.getAge()); 
	} 
	} 