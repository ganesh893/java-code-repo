package PracticePrograms;

public class Prim002 {

	public static void main(String[] args) {
		
		int tot=20;
		String sPalindrome=" ";
		for(int i=1;i<=tot;i++)
		{
			int count=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count=count+1;
					//num=0;
				}
			}
			if(count==2)
			{
				sPalindrome=sPalindrome+i+" ";
			}
			
		}
		System.out.println("the palindrome number is");
		System.out.println(sPalindrome);

	}

}
