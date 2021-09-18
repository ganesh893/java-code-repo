package InterivewQuetions;

public class Fibonaci {

	public static void main(String[] args) {
		
		int tot=10, n1=0, n2=1;
		System.out.print(n1+" "+n2);
		int n3;
		for(int i=2;i<tot;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		

	}

}
