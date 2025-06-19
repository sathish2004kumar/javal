package Week2;

public class Search {
	public static void main(String[] args) {
		int [] a = {1,3,4,6,8,9,12};
		int target = 12 ;
		for(int i = 0 ; i<a.length; i++) {
			if (a[i]==target) {
				System.out.println(i);
				break;
				
			}
		}
	}

}
