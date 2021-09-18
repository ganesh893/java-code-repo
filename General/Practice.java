package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {


		String s="abcdabcda";
		
		char[] c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length-1;i++)
		{
			count=1;
			for(int j=i+1;j<c.length-1;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					c[j]='0';
				}
			}
			if(count>=1&& c[i]!='0')
			{
				System.out.println(c[i]);
			}
			
		}// end of repeated characters program

		
		System.out.println("*******Swap the String without using thired variable***************");
		
		String fname="ganesh";
		String lName="Patkal";
		System.out.println(fname+" "+lName);
		fname=fname+lName;
		
		lName=fname.substring(0,fname.length()-lName.length());
		fname=fname.substring(lName.length());
		System.out.println(fname+" "+lName);
		
		System.out.println("*******Store ArrayList Into Array And vice versa***************");
		
		System.out.println("ArrayList To array");
		List<String> al= new ArrayList<String>();
		al.add("ab");
		al.add("cd");
		
		String[] sa= al.toArray(new String[al.size()]);
		System.out.println(sa[0]);
		System.out.println("array To ArrayList ");
		
	//	ArrayList<String> al2=  Arrays.asList(sa);
		
		
		System.out.println("*******Find Even and odd number in array***************");
		int[] iArray={5,15,19,6,7,8,11,13};
		for(int i=0;i<iArray.length;i++)
		{
			if(iArray[i]%2==0)
			{
				System.out.println("The number :"+iArray[i]+" is even");
			}else
				System.out.println("The number :"+iArray[i]+" is Odd");
		}
		
		
	}

}
