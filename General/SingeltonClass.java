package General;

public class SingeltonClass {

	public static void main(String[] args) {
		
		abc ab= new abc();
		abc ab2= new abc();
		

	}

}
class abc{
	private static abc a= new abc();
	abc()
	{
		
	}
	public static abc instance()
	{
		return a;
	}
}