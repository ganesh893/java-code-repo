package PracticePrograms;

public class ExceptionTest {

	public static void main(String[] args) {


		
		int i=10;
		try{
		int c=i/0;
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
