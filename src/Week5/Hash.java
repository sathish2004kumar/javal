package Week5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>a=new HashSet();
		Set<Integer>a1=new HashSet();
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(2);
		a.add(3);
		a.add(6);
		a.add(7);
		System.out.println(a);
		a.remove(7);
		System.out.println(a);
		a.isEmpty();
		System.out.println(a);
		a1.addAll(a);
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		System.out.println(a.contains(5));
		Iterator<Integer>it=a.iterator();
		while(it.hasNext()) {
			int num = it.next();
			if(num==2) {
				it.remove();
			}
			System.out.println(a);
		}
		
		}

	}


