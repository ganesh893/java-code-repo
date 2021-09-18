package General;

public class Fibonaci {

	public static void main(String[] args) {
		System.out.println("Fibonaci series");
		int n1=0,n2=1,n3, total=20;
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<total;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
