package InterivewQuetions;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String s1="Ganesh";
		String s2="Genahs";
		boolean flag=true;
		if(s1.length()!=s2.length())
			System.out.println("Length is not same");
		else
			System.out.println("Length is  same");

		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		for(int i=0;i<c1.length;i++)
		{
			if( c1[i]!=c2[i])
			{
				
				flag=false;
				break;
			}
			
		}
		if(!flag)
			System.out.println("String is not anagram");
		else
			System.out.println("String is anagram");
		





	}
}
