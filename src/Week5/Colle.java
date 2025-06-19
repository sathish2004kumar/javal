package Week5;

import java.util.ArrayList;

public class Colle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList();
		ArrayList<Integer> a1 = new ArrayList();
		a.add(10);
		a.add(5);
		a.add(15);
		a.add(20);
		a.add(3);
		System.out.println(a);
		a.add(1, 3);
		a.add(4, 25);
		System.out.println(a);
		System.out.println(a.get(2));
		a.set(4, 25);
		System.out.println(a);
		a.remove(3);
		a.remove(5);
		System.out.println(a);
		a1.addAll(a);
		System.out.println(a1);
		a.clear();
		System.out.println(a1);
		a.removeIf(e->e<10);
		System.out.println(a);
		
		
		
	}

}
