package AbstractClass;

public class Honda extends Bike{
void run()
{
	System.out.println("bike running");
	}
static void disel()
{
	System.out.println("some bike runns on disel");}
	public static void main(String[] args) {
		//Bike n= new Bike();
		Bike b= new Honda();
		b.run();
		b.fast();
		Bike.petrol();
		disel();
		b.breaks();
	}

}
