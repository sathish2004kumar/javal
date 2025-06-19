package Week5;
import java.util.Iterator;
import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a = new LinkedList();
		LinkedList<Integer> a1 = new LinkedList();
		a.add(2);
		a.add(3);
		a.add(0);
		a.add(1);
		a.add(0);
		a.add(1);
		a.add(2);
		System.out.println(a);
		a.add(2, 4);
		a.add(3, 5);
		System.out.println(a);
		System.out.println(a.get(3));
		a.set(4, 6);
		System.out.println(a);
		a.remove(5);
		System.out.println(a);
		a1.addAll(a);
		System.out.println(a1);
		a.clear();
		System.out.println(a);
		a.removeIf(e-> e>3);
		System.out.println(a);
		System.out.println(a1.contains(2));
		System.out.println(a1.lastIndexOf(2));
		System.out.println(a1.isEmpty());
		System.out.println(a1.subList(2, 6));
		a1.sort(null);
		System.out.println(a1);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			}
		Iterator<Integer>it = a1.iterator();
		while(it.hasNext()) {
			int num = it.next();
			if(num==2) {
			it.remove();
		}
			System.out.println(a1);
	
		}
		
		
		
	
		

	}

}
