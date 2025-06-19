package Week5;

import java.util.HashMap;

public class Hashm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> a = new HashMap <Integer,String>();
		a.put(1, "dhoni");
		a.put(2,"virat");
		a.put(null,"jaddu");
		a.put(3, null);
		a.put(3,"rohit");
		System.out.println(a);
		System.out.println(a.getOrDefault(2,"def"));
		System.out.println(a.getOrDefault(5,"def"));
		System.out.println(a.containsValue("jaddu"));
		System.out.println(a.containsKey(3));
		System.out.println(a.replace(3,"jaddu"));
		System.out.println(a.isEmpty());
		System.out.println(a.keySet());
		System.out.println(a.values());
		System.out.println(a.remove(null,"jaddu"));
		System.out.println(a.entrySet());
		a.entrySet().forEach (b-> {
			if(b.getValue().equals("virat")) {
				System.out.println(b.getKey());
		}
		});

}
}
	

