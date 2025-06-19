package Week5;

public class Str2 {
	static String s1="how are you";
	String subString(int start , int end) {
		try {
			 if(start>end) {
				 throw new Exception("start index of greater than of end index");
			 }
			 String result = "";
	            for (int i = start; i < end; i++) {
	                result += s1.charAt(i); 
	            }
	            return result;
		}
			  catch(Exception e) {
				  return "Error: " + e.getMessage();
			  }
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Str2 s1 = new Str2();
		System.out.println(s1.subString(0,11));
		System.out.println(s1.subString(11,20));
		System.out.println(s1.subString(12,5));
		System.out.println(s1.subString(0,40));
		
		

	}

}
