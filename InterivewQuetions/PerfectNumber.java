package InterivewQuetions;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num=28;
		int temp=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				temp=temp+i;
			}
		}
		if(num==temp)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not");
		}

	}

}
