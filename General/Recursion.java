package General;

public class Recursion {

	public static int sum(int k)
	{
		if(k>0)
		{
			System.out.println(k);
			return k+sum(k-1);
		}else
			return 0;
	}
	
	public static void main(String[] args) {
		
int r=sum(10);
System.out.println(r);
	}

}
