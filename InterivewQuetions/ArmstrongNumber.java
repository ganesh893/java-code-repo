package InterivewQuetions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num=371;
		int iArms=0;
		int temp=num;
		while(num!=0)
		{
			int r=num%10;
			iArms=iArms+r*r*r;
			num=num/10;
			
		}
		
if(temp==iArms)
{
System.out.println("the number is armstrong :"+temp);	
}else
{
	System.out.println("not armstrong");}
	}

}
