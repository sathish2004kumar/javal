package Week5;

public class Wrap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sa$ @*t h18 #i7";
		int a=0,b=0,c=0,d=0;
		  for (int i = 0; i < s.length(); i++) {
	            char c1 = s.charAt(i);

		if(Character.isLetter(c1)) {
			a++;
			
		}
		else if(Character.isDigit(c1)) {
			b++;
		}
		else if(Character.isWhitespace(c1)) {
			c++;
		}
		else {
			d++;
		}
			}
System.out.println("letter:"+a);
System.out.println("digit:"+b);
System.out.println("sapce:"+c);
System.out.println("Symbol:"+d);
	}
}

