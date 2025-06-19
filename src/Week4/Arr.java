package Week4;
public class Arr {
 public static void main(String[] args) 
 {
	 int num = 6234;
	 System.out.println("Even number:");
	 
	 while(num > 0)
	 {
            int digit = num % 10;
            if (digit % 2 == 0)
            {
             System.out.println(digit);
            }
            num=num/10;
        }
	 int num1 =(int) 99;
    }
}
