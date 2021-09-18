package PracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemDuplFromArray {

	 void m1()
	 {}
	
	public static void main(String[] args) {
		 
	//	String s="";
		 final int j;
         j=10;
       //  j=20;
         String[] s={"Ga","NE","SH","GA","SH"};
		int[] i={10,20,10,50,30};
		//List l= new ArrayList<>();
		//l.addAll(i);
		List l=Arrays.asList(i);
		List ls=Arrays.asList(s);
		//ls.add("Pa");// unsupported operation
		System.out.println(l.toString());
		System.out.println(ls);
		List<String> List=new ArrayList<>();
		List.add("aaa");
		List.add("bbb");
		 String[] s1= List.toArray(new String[List.size()]);
		
		Set<Integer> si = new LinkedHashSet<Integer>();
		for(int k=0;k<i.length-1;k++)
		{
			si.add(i[k]);
		}
		System.out.println(si);
		
		System.out.println("***********remove duplicate from String*****************");
		
		String str="nayani";
		char[] sc=str.toCharArray();
		int index=0;
		
		for(int p=0;p<sc.length;p++)
		{
			int q;
			for(q=0;q<p;q++)
			{
				if(sc[p]==sc[q])
				{
					break;
				}
				
			}
			if(p==q)
			{
				sc[index++]=sc[p];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(sc,sc.length)));   
		System.out.println(sc);
		
		
	}

}
