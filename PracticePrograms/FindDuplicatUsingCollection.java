package PracticePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatUsingCollection {

	public static void main(String[] args) {


		
		String s="india india";	
    	char[] c=s.toCharArray();
	
	Map<Character, Integer> hm= new HashMap<>();
		for(Character ch:c)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
				hm.put(ch, 1);
		}
		
	   Set<Character> set =hm.keySet();
	   for(Character ch:set)
	   {
		   if(hm.get(ch)>1)
		   {
			   System.out.println(ch+" character is repeated  :"+hm.get(ch));
		   }
	   }
	}

}
