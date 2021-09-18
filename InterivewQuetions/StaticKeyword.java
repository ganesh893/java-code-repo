package InterivewQuetions;

public class StaticKeyword extends StaticKeyword2{
	static int i;
	final int j=10;
	int l;

	{
		l=100;
		System.out.println("inside init block");
	}

	public StaticKeyword() {

		System.out.println("value of instanca variable :"+l);
	}
	static 
	{
		System.out.println("in static block");
	}

	public static void m()
	{
		System.out.println("Static method m of class staticKeyword");
	}
	//j=30;
	public void instanceM()
	{
		System.out.println("Child Instance Method");
	}

	public static void main(String[] args) {

		final int k;
		k=20;
		System.out.println("im in main method");
		StaticKeyword2 s= new StaticKeyword();
		StaticKeyword.m();
		s.instanceM();
		//k=30;

	}

}
