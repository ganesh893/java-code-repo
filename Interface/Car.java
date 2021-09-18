package Interface;

public interface Car {
	public static int i=10;
	public final int j=20;
	 int k=30;
void breaks();

public static void safty()
{
System.out.println("yes have seat belts");
}

default void run()
{

	System.out.println(" yess in runnig state ");
	
	}

}
