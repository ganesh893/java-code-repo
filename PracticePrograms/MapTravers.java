package PracticePrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTravers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> hm= new HashMap<>();
		hm.put(1, "abc");
		hm.put(2, "PQR");
		hm.put(3, "xyz");
		System.out.println(hm);
		
		Set se=hm.entrySet();
		Iterator it=se.iterator();
				
		/*for(Map.Entry me1:((Map<Integer, String>) it).entrySet())
		{
			System.out.println(me1.getKey()+" --- "+me1.getValue());
		}*/
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey()+"---"+me.getValue());
			
		}
		
		for(Map.Entry me1:hm.entrySet())
		{
			System.out.println(me1.getKey()+" --- "+me1.getValue());
		}
		
		
		
		
	}

}
