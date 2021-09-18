package PracticePrograms;

public class PalindromString {

	public static void main(String[] args) {

		String ss="nayani";
		
		
		int i=0; int j=ss.length()-1;
		//System.out.println("String is not palindrome");
		boolean flag=true;
		while(i<j)
		{ 
			if(ss.charAt(i)!=ss.charAt(j))
			{
				flag=false;
			}
		
			i++;
			j--;
		}
		if(!flag)
		{
			System.out.println("String is not palindrome");
		}
/*char[] c=ss.toCharArray();
boolean flag=true;
		for(int i=0;i<c.length;i++)
		{
           for(int j=c.length;j>=0;j--)
           {
        	   if(c[i]!=c[j])
        	   {
        		   flag=false;
        		   break;
        	   }
           }
		}
		if(flag==false)
		{
			System.out.println("the string is not palindrome :"+ss);
		}

*/	}

}
