package PracticePrograms;

//Java implementation of the approach
public class vdf {

	// Function that returns true if
	// str is a palindrome
	static boolean isPalindrome(String str)
	{
		
		
		int i=0,j=str.length()-1;
		
		while(i<=j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
	
		return true;
	}

	
	public static void main(String[] args)
	{
		String str = "kanak";
		int num=12521;
		System.out.println(num);
		int rev=0;
		//revers the number
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		//System.out.println(num);
System.out.println(rev);
num=1524;

		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");
	}

	
}

