package General;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("checking numbe is palindrome or not");
		int n=4542;
		int remain,sum=0, temp;
		temp=n;
        while(n>0)
        {
        	remain=n%10;//1. 454%10=4  2. 45%10=5  3. 4%10=4
        	sum=(sum*10)+remain;//1.(0*10)+4=4  2.  (4*10)+5=45  3. (45*10)+4=454 
        	n=n/10;//1. 454/10=45   2.   45/10= 4     3. 4/10=0
        }
        if(temp==sum)
        {
        	System.out.println("yes number is palindrom");
        }else
        	System.out.println("number is not");
        

	}

}
