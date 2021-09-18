package PracticePrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		//List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add("Ganesh");
		l.add(null);
		//l.add(10.00);
		l.add(30);
		l.add(20);
		l.add(10);
		
		l.add(30);
		l.add(20);
		l.add(50);
		l.add(30);
		l.add(20);
		
		l.add(10);
		
		System.out.println("the size of the arrayList :"+l.size());
		//System.out.println("the size of the arrayList :");
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Set s= new LinkedHashSet(l);
		System.out.println(s);
		

	}

}
