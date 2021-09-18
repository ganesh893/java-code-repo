package PracticePrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		//Palindrom number/ string
		boolean flag=true;
		String str="kanak";
		String[] strA={str}; 
		//System.out.println("String is not palindrom");
		for(int i=0;i<strA.length;i++)
		{
			for(int j=strA.length-1;j>=0;j--)
			{
				if(strA[i]!=strA[j])
				{
					flag=false;
				}
			}
			
		}
		if(!flag)
		{
			System.out.println("String is not palindrom");
		}

	}

}
