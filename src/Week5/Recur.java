package Week5;

public class Recur {
 public static int sum(int n) {
	 if(n==1) {
		 return 1;
	 }
	 else {
		 return n + sum(n-1);
	 }
 }
 public static void main(String[] args) {
	 int number = 15;
	 int result = sum(number);
	 System.out.println("sum of numbers from 1 to" + number + "is:" + result );
}
}