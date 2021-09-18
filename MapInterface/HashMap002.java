package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMap002 {

	public static void main(String[] args) {
	Map<String ,Integer> hm= new LinkedHashMap<>();	
//	HashMap<String, Integer>hm= new HashMap();
	hm.put("id", 1);
	hm.put("marks", 20);
	hm.put("MOBNo", 345);
	
	System.out.println(hm.get("marks"));
	System.out.println(hm);
	
Set s=hm.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext())
{
     Map.Entry a =(Map.Entry )itr.next();
     System.out.println(a.getKey()+"  "+a.getValue());
}
	
	}

}
