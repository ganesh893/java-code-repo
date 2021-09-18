package PracticePrograms;

public class Palindrome002 {

	public static void main(String[] args) {


		int num=99;
		int temp=num;
		System.out.println("number is  :"+num);
		int rev=0;

		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("number is palindrome :"+rev);
		}
		else
			System.out.println("number is not palindrome :"+rev);
	}

}
