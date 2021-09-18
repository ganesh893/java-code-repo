package InterivewQuetions;

public class Recursion {
static String abv;
	
	public static void main(String[] args) {

		Recursion r= new Recursion();
		r.num(1);
	}

	private static void num(int i) {
		abv="abc";
		if(i>10)
		{
			return;
		}
		else
		{
			System.out.print(" "+i);
			num(i+1);
			
		}
	}

}
