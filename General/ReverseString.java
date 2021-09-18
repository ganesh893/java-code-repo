package General;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {

		String name="Ashwini Ganesh Patkal";
		System.out.println(name);
		char[] na=name.toCharArray();

		for(int i=na.length-1; i>=0;i--)
		{
			System.out.print(na[i]);
		}
		// Using collection
		System.out.println("reverse string using collection");
		char[] names=name.toCharArray();
		List<Character> cl= new ArrayList<>();
		
		for(char c:names)
		{
			cl.add(c);
		}
		Collections.reverse(cl);
		Iterator<Character> ci=cl.iterator();
		while(ci.hasNext())
		{
			System.out.print(ci.next());
		}

	}

}
