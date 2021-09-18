package AbstractClass;

public abstract class Bike {
int i=10;
private int j=20;
abstract void run();
void fast()
{
	System.out.println("Running very fast");}

public static void petrol()
{
	System.out.println("yes the bike is run on petrol");}

public final void breaks()
{
System.out.println("every bike need good braking system");	
}

}
