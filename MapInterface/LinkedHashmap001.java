package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmap001 {

	public static void main(String[] args) {
Map<Integer,String> lm= new LinkedHashMap<>();
		
lm.put(1, "ganesh");
lm.put(4, "Ramesh");
lm.put(2, "Suresh");
lm.put(3, "Chandan");
System.out.println(lm);
System.out.println(lm.get(1));

Set s= lm.entrySet();
Iterator it=s.iterator();
while(it.hasNext())
{
Map.Entry<Integer, String> me=(Map.Entry<Integer, String>)it.next();
System.out.println(me.getKey()+" "+me.getValue());
}

	}

}
