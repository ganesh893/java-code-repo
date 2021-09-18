package InterivewQuetions;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		PrintNumberWithoutLoop p= new PrintNumberWithoutLoop();
		p.num(10);
		
		
	}

	private void num(int i) {
		
		if(i<=0)
		{
			return ;
		
		}
		else
		{
			num(i-1);
			
			System.out.print(" "+i);
		}
		
	}

}
