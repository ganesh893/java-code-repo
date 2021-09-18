package PracticePrograms;

public class PrimeNumbers {

	public static void main(String[] args) {

		int num=0;
		String strPrimeNumbers=" ";
		for(int i=1;i<100;i++)
		{
			int count=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count=count+1;

				}

			} if(count==2)
			{
				strPrimeNumbers=strPrimeNumbers + i + " ";
			}
		}
		System.out.println("the prime numbers are");
		System.out.println(strPrimeNumbers);

	}

}
