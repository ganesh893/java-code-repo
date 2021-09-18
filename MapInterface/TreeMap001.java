package MapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap001 {

	public static void main(String[] args) {
		
		Map<String,String> tm= new TreeMap<>();
		tm.put("name", "Ganesh");
		tm.put("Lname", "Patkal");
		tm.put("Mname", "Pandurang");
		
		System.out.println(tm.get("Lname"));
		System.out.println(tm);
		
        Set s=tm.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
        	Map.Entry me=(Map.Entry)itr.next();
        	System.out.println(me.getKey()+" "+me.getValue());
        	if(me.getKey().equals("Mname"))
        	{
        		itr.remove();
        	}
        }
        
        System.out.println(tm);
	}

}
