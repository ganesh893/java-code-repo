package General;

public class ThisAndSuper extends SperClass{
private String s="Child String";
protected void show()
{

	System.out.println(" im in Child class method");
}
	private void m()
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("*********Metohds**************");
		show();
		this.show();
		super.show();
	}
	
	public static void main(String[] args) {
		ThisAndSuper c= new ThisAndSuper();
		c.m();

	}

}
