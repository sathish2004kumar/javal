package Revise;

class Sum{
	public void calculate(int a, int b) {
		System.out.println("base Operation");
	}}
class Add extends Sum{
	public void calculate(int a,int b) {
		System.out.println("Addition:"+(a+b));
}}
class Sub extends Sum{
	public void calculate(int a,int b) {
		System.out.println("Subtraction:"+(a-b));
	}}
class Mul extends Sum{
	public void calculate(int a,int b) {
		System.out.println("Multiply:"+(a*b));
	}}
class Div extends Sum{
	public void calculate(int a,int b) {
		System.out.println("Division:"+(a/b));
	}}


public class Cal2 {

	public static void main(String[] args) {
		Sum s;
		s = new Add();
		s.calculate(10, 15);
		s = new Sub();
		s.calculate(15, 10);
		s = new Mul();
		s.calculate(2, 5);
		s = new Div();
		s.calculate(25, 5);
		
		

	}

}
