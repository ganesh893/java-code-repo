package InterivewQuetions;

public class PrimeNumbers {

	public static void main(String[] args) {

		int t=20;
		
		String s_PrimeNumbers=" ";
		int count;
		for(int i=1;i<=t;i++)
		{
			count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count=count+1;
					
				}
			}
			if(count==2)
			{
				s_PrimeNumbers=s_PrimeNumbers+i+" ";
			}
		}
		System.out.println(s_PrimeNumbers);
		
	}

}
