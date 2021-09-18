package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add("ganesh");
		l.add(1);
		l.add(1.00);
		l.add(null);
		l.add("ganesh");

		System.out.println(l);

		HashSet set= new HashSet<>();
		set.add("Ganesh");
		set.add(10);
		System.out.println(set.add(10));
		set.add(null);
		set.add(null);

		System.out.println(set);

		LinkedHashSet set1= new LinkedHashSet<>();
		set1.add("Ganesh");
		set1.add(10);
		System.out.println(set1.add(10));
		set1.add(null);
		set1.add(null);
		System.out.println(set1);



	}

}
