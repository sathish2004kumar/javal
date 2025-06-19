package Week5;

class Calculator { 
int add(int a, int b) { 
return a + b; 
} 
int add(int a, int b, int c) { 
return a + b + c; 
} 
double add(double a, double b) { 
return a + b; 
} 
} 
public class Calc { 
public static void main(String[] args) { 
Calculator calc = new Calculator(); 
System.out.println(calc.add(5, 3));      
System.out.println(calc.add(5, 3, 2));   
// 8 
// 10 
System.out.println(calc.add(4.5, 3.2));  // 7.7 
} 
} 