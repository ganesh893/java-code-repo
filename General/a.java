package General;

 class b {
 int i=50;
 
 void show()
	{
		System.out.println(i);
	}
}
 public class a extends b
{
	int i;
	void m(int i)
	{
		super.i=i;
		
	}
	void show()
	{
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		a c= new a();
		c.m(30);
		c.show();
	}
}