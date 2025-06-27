package Week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Str {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		List<Integer> a1= a.stream().map(e-> e+2) 
				.map(e-> e-2)
				.map(e-> e*2)
				.map(e-> e/2)
				.filter(q-> q<10)
				.collect(Collectors.toList());
		System.out.println(a1);
		Optional<Integer> a2= a.stream().map(e-> e+2) 
				.map(e-> e-2)
				.map(e-> e*2)
				.map(e-> e/2)
				.filter(q-> q<10)
				.findFirst();
		System.out.println(a2.get());
		
		boolean isAvail = a.stream().allMatch(q-> q<7);
		System.out.println(isAvail);
		boolean isCheck = a.stream().anyMatch(q-> q<7);
		System.out.println(isCheck);
		
		
	}

}
