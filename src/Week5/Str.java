package Week5;
import java.util.Arrays;

public class Str {
	public static void main(String[] args) {
String a = "How are you";
String[] arr=a.split(" ");
char[] carr= {'b','u','s','y'};
System.out.println(String.copyValueOf(carr));
System.out.println(Arrays.toString(arr));
System.out.println(a.indexOf("o"));
System.out.println(a.lastIndexOf("o"));
System.out.println(a.charAt(2));
System.out.println(a.startsWith("H"));
System.out.println(a.contains("ou"));
String b = "li";
b+="ke";
String c = "like";
System.out.println(b.equals(c));
String B = "LI";
B+="KE";
String C = "    like    ";
System.out.println(B.equalsIgnoreCase(C));
System.out.println(a.substring(4,8));
System.out.println(a.toUpperCase());
System.out.println(a.toLowerCase());
System.out.println(C.length());
System.out.println(C);
System.out.println(C.trim());
System.out.println(C.trim().length());
a=a.trim();
System.out.println(a.concat(" Fine"));
	}
	
}
