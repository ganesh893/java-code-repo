package PracticePrograms;

import java.util.Arrays;

public class Rem {

	public static void main(String[] args) {
		String str="nayani";
		char[] sc=str.toCharArray();
		int length=sc.length;
		int index=0;
		
		for(int p=0;p<length;p++)
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
				sc[index]=sc[p];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(sc,sc.length)));   
	//	System.out.println(sc.length-1);
		
		

	}

}
