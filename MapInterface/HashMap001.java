package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap001 {

	public static void main(String[] args) {
		
		Map<Integer,String> hm= new HashMap<>();
		
		hm.put(1, "ganesh");
		hm.put(4, "Ramesh");
		hm.put(2, "Suresh");
		hm.put(3, "Chandan");
		System.out.println(hm);
		System.out.println(hm.get(1));
		for(Entry m:hm.entrySet())
		{
			System.out.println(hm.keySet()+" "+hm.values());
		}
		
		// or we can traverse by using set
		hm.remove(3);
		Set s=hm.entrySet();
         Iterator i= s.iterator();
        		 while(i.hasNext())
        		 {
        			 Map.Entry me= (Map.Entry)i.next();
        			 System.out.println(me.getKey()+" "+me.getValue());
        			 hm.remove(i);
        		 }

	}

}
