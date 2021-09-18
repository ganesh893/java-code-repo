package InterivewQuetions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RepeatedStringUsingCollection {

	public static void main(String[] args) {

		String s="Ganesh patkal";
		char[] cs=s.toCharArray();
		HashMap<Character, Integer> hm= new HashMap<>();
		for(char c:cs)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, (hm.get(c))+1);
			}else
			{
				hm.put(c, 1);
			}
				
		}
		
		Set se=hm.entrySet();
		Iterator itr=se.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}

	}

}
